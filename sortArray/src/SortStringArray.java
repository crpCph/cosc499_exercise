import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {
    private int length;
    private String[] array;

    public SortStringArray(int l){
        length = l;
        array = new String[length];

        generate();
    }

    public String get(int i){
        return array[i];
    }

    public void set(int i, String x){
        array[i] = x;
    }

    public void generate(){
        try {
            File txt = new File("res/text.txt");
            Scanner sc = new Scanner(txt);

            for (int i = 0; i < length; i++) {
                if(sc.hasNext())
                    set(i, sc.next());
                else
                    break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void sort(){
        Arrays.sort(array);
    }

    public void print(){
        System.out.println("String Array:");
        for(int i=0; i<length; i++){
            System.out.print("[" + i + "]:" + array[i] + ", ");
        }
        System.out.println();
    }
}
