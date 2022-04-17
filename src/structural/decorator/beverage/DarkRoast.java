package structural.decorator.beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(String decription) {
        super(decription);
    }

    @Override
    public int cost() {
        return 10;
    }
}
