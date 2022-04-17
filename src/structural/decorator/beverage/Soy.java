package structural.decorator.beverage;

public class Soy extends CondimentDecorator{
    public Soy(String decription, Beverage beverage) {
        super(decription, beverage);
    }

    @Override
    public int cost() {
        return beverage.cost() + 7;
    }
}
