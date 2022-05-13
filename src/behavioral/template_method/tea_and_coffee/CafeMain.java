package behavioral.template_method.tea_and_coffee;

public class CafeMain {
    public static void main(String[] args) {
        Coffee cf1 = new Coffee();
        Tea cf2 = new Tea();
        cf1.phucVu();
        cf2.phucVu();
    }
}
