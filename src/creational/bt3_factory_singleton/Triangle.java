package creational.bt3_factory_singleton;

public class Triangle extends Shape{
    private Triangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    private static Triangle instance;

    public static Triangle createInstance(String brush, String paper, String frame){
        if (instance == null) {
            instance = new Triangle(brush, paper, frame);
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
        System.out.println("Hình tam giac" + brush + paper);
    }
}
