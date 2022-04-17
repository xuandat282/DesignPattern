package behavioral.stratery.example;

public class VitGioi extends Duck{
    @Override
    public String display(){
        return "E la vit gioi " +
                "bay: " + performFly() + "\n" +
                "Boi: " + swim() + "\n" +
                "em keu: " + performQuack();
    }
}
