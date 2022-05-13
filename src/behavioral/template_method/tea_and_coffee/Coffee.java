package behavioral.template_method.tea_and_coffee;

public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Pha cà phê");
    }

    @Override
    public void addCondiment() {
        System.out.println("Thêm đường sữa");
    }
    public void phucVu(){
        System.out.println("-----------------");
        System.out.println("Phục vụ cà phê");
        prepareRecipe();
        boilWater();
        purInCup();
        brew();
        addCondiment();
    }
}
