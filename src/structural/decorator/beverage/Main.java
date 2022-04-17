package structural.decorator.beverage;

public class Main {
    public static void main(String[] args){
        Beverage b = new DarkRoast("cf ngon");
        b = new Milk("Sua ong tho", b);
        b = new Soy("Sua dau nanh", b);
        b = new Whip("Ruou", b);
        System.out.println("des: " + b.getDecription());
        System.out.println("Gia: "+ b.cost());
    }
}
