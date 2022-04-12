package structural.decorator.heverage;

public class Beverage {
    String decription;

    public Beverage(String decription) {
        this.decription = decription;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
    public abstract int cost();
}
