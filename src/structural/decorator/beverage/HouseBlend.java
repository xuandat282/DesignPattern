package structural.decorator.beverage;

public class HouseBlend extends Beverage{
    public HouseBlend(String decription) {
        super(decription);
    }

    @Override
    public int cost() {
        return 20;
    }
}
