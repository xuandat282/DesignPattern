package builderpatterm.Iterator.Array;

import java.util.Arrays;

public class ArrayAggreate implements Iaggregate {

    public int mangs [] = {1,2,3,4,5};

    @Override
    public String toString() {
        return "mang = " + Arrays.toString(mangs);
    }

    @Override
    public Iiterator CreateIterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iiterator {
        int index;
        @Override
        public int getItem(int i) {
            System.out.println("Phẩn tử: " + i);
            if (i > mangs.length)
                System.out.println("không có phần tử thứ "+ i + " trong mảng");
            else {
                for (index = 0; index < mangs.length; index++){
                    if (i == index){
                        System.out.println("Phần tử thứ "+ i + " trong mảng: " + mangs[index]);
                    }
                }
            }
            return 0;
        }

        @Override
        public int count() {
            return mangs.length;
        }
    }
}
