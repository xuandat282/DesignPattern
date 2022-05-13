package behavioral.template_method.tea_and_coffee;

public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        System.out.println("Chuẩn bị công thức");
    };
    public void boilWater(){
        System.out.println("Đun nước");
    };
    public void purInCup(){
        System.out.println("Cho nước vào ly");
    };
    public abstract void brew();
    public abstract void addCondiment();
}
