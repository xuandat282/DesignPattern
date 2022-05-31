package behavioral.template_method.tea_and_coffee;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Pha trà");
    }

    @Override
    public void addCondiment() {
        System.out.println("Thêm chanh");
    }

}
