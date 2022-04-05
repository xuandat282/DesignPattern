package stratery.example;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract String display();
    public String swim(){
        return "Em biet boi";
    }

    String performFly(){
        return flyBehavior.fly();
    }
    String performQuack(){
        return quackBehavior.quack();
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
