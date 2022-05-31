package behavioral.iterator.example;

public class ArrayAggregate {
    int[] array;
    public MyIterator createIterator(){
        return new ArrayIterator(this);
    }
}
