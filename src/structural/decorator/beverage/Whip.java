package structural.decorator.beverage;

public class Whip extends CondimentDecorator{
    public Whip(String decription, Beverage beverage) {
        super(decription, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 12;
    }
}
