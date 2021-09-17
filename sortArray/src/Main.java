public class Main {
    public static void main(String[] args){

        //Int Array
        SortIntArray sia = new SortIntArray(20);

        System.out.println("Before sort:");
        sia.print();

        System.out.println("After sort:");
        sia.sort();
        sia.print();
        System.out.println();

        //String Array
        SortStringArray sta = new SortStringArray(40);

        System.out.println("Before sort:");
        sta.print();

        System.out.println("After sort:");
        sta.sort();
        sta.print();

    }
}
