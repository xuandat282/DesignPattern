package behavioral.stratery.example;

public class DuckMain {
    public static void main(String[] args) {
        Duck duck = new VitGioi();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Squeak());
        System.out.println(duck.display());
    }
}
