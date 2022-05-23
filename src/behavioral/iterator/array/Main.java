package builderpatterm.Iterator.Array;

public class Main {
    public static void main(String[] args) {
        ArrayAggreate arrayAggreate = new ArrayAggreate();
        Iiterator iiterator = arrayAggreate.CreateIterator();
        System.out.println(arrayAggreate.toString());
        iiterator.getItem(9);
        iiterator.getItem(3);
        System.out.println("Số phần tử của mảng: " + iiterator.count());
    }
}
