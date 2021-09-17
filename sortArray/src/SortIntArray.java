import java.util.Arrays;

public class SortIntArray {
    private int length;
    private int[] array;

    public SortIntArray(int l){
        length = l;
        array = new int[length];

        generate();
    }

    public int get(int i){
        return array[i];
    }

    public void set(int i, int x){
        array[i] = x;
    }

    public void generate(){
        for(int i=0; i<length; i++){
            set(i, (int)(Math.random()*length *10));
        }
    }

    public void sort(){
        Arrays.sort(array);
    }

    public void print(){
        System.out.println("Integer Array:");
        for(int i=0; i<length; i++){
            System.out.print("[" + i + "]:" + array[i] + ", ");
        }
        System.out.println();
    }
}
