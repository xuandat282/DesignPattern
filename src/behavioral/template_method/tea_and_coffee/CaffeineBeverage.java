package behavioral.template_method.tea_and_coffee;

public abstract class CaffeineBeverage {
    public abstract void prepareRecipe();
    public abstract void boilWater();
    public abstract void purInCup();
    public abstract void brew();
    public abstract void addCondiment();
}
