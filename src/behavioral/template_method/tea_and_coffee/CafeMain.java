package behavioral.template_method.tea_and_coffee;

public class CafeMain {
    public static void main(String[] args) {
        CaffeineBeverage cf1 = new Coffee();
        CaffeineBeverage tea1 = new Tea();
        cf1.prepareRecipe();
        tea1.prepareRecipe();
    }
}
