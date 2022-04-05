package creational.bt2_builder;

public class Main {
    public static void main(String[] args){
        MyStringBuilder ms = new MyStringBuilder.Builder("Xuan Dat")
                .addString(" D ")
                .addFloat(2022F)
                .addBool(true)
                .build();
        System.out.println(ms.toString());
    }
}
