package creational.bt3_factory_singleton;

public class Rectangle extends Shape{
    private Rectangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    private static Rectangle instance;

    public static Rectangle createInstance(String brush, String paper, String frame){
        if (instance == null) {
            instance = new Rectangle(brush, paper, frame);
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
        System.out.println("Hình vuông" + brush + paper);
    }

}
