package behavioral.iterator.array;

public class ArrayAgg {
    int [] mang = {};

    public ArrayAgg(int[] mang) {
        this.mang = mang;
    }

    public int Count()
    {
        return mang.length;
    }
    public int getItem(int i)
    {
        return this.mang[i];
    }

    public MyInter createIter(){
        return new ArrayIte(this);
    }
}
