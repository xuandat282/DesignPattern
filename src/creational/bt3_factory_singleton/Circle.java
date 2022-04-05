package creational.bt3_factory_singleton;

public class Circle extends Shape{
    private Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    private static Circle instance;

    public static Circle createInstance(String brush, String paper, String frame){
        if (instance == null) {
            instance = new Circle(brush, paper, frame);
        }
        else{
            instance.brush = brush;
            instance.paper = paper;
            instance.frame = frame;
        }
        return instance;
    }
    @Override
    public void draw(){
        System.out.println("Hình tronf" + brush + paper);
    }
}
