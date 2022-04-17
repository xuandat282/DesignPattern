package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public CondimentDecorator(String decription, Beverage beverage) {
        super(decription);
        this.beverage = beverage;
    }

    @Override
    public String getDecription() {
        return beverage.getDecription() + ", " + this.decription;
    }
}
