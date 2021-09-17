public class Main {
    public static void main(String[] args){
        SortStringArray sta = new SortStringArray(40);

        System.out.println("Before sort:");
        sta.print();

        System.out.println("After sort:");
        sta.sort();
        sta.print();
    }
}
