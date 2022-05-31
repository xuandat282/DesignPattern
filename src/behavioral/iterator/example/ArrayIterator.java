package behavioral.iterator.example;

public class ArrayIterator implements MyIterator{
    ArrayAggregate arrayAggregate;

    public ArrayIterator(ArrayAggregate arrayAggregate) {
        this.arrayAggregate = arrayAggregate;
    }
}
