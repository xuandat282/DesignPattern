package structural.decorator.beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(String decription, Beverage beverage) {
        super(decription, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 8;
    }
}
