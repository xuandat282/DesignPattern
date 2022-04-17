package structural.decorator.beverage;

public class Espresso extends Beverage{
    public Espresso(String decription) {
        super(decription);
    }

    @Override
    public int cost() {
        return 20;
    }
}
