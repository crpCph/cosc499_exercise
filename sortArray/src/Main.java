public class Main {
    public static void main(String[] args){
        SortIntArray sia = new SortIntArray(20);

        System.out.println("Before sort:");
        sia.print();

        System.out.println("After sort:");
        sia.sort();
        sia.print();
    }
}
