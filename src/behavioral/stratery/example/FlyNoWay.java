package behavioral.stratery.example;
// lớp thực thi giao diện
public class FlyNoWay implements IFlyBehavior{

    @Override
    public String fly() {
        return "i can't fly";
    }
}
