package behavioral.iterator.array;

public class Main {
    public static void main(String[] args) {
        ArrayAgg a = new ArrayAgg(new int[]{1,2,3,4,5});
        MyInter in = a.createIter();
        in.first();
        System.out.println(in.next());
        while(!in.isDone())
        {
            System.out.println(in.currentItem());
            in.next();
        }
    }
}
