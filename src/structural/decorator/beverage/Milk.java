package structural.decorator.beverage;

public class Milk extends CondimentDecorator{
    public Milk(String decription, Beverage beverage) {
        super(decription, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 9;
    }
}
