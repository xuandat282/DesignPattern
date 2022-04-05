package creational.builder.computer;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer.Builder()
                .addCPU("i9 12900K")
                .addDisk("Samsung EVO 960 2T")
                .addRAM("Samsung gaming kit 32GB")
                .addScreen("Samsung 32inch")
                .addGPU("RTX 3080")
                .build();
        System.out.println(computer.toString());
    }
}