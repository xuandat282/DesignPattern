package creational.bt3_factory_singleton;

public class ShapeFactory{
    public Shape createShape(ShapeType shapeType){
        if (shapeType == null){
            return null;
        }else if (shapeType == ShapeType.Rectangle){
            return Rectangle.createInstance("but","giay a4","khung go");
        }else if (shapeType == ShapeType.Triangle){
            return Triangle.createInstance("but","giay a4","khung go");
        }else if (shapeType == ShapeType.Circle){
            return Circle.createInstance("but","giay a4","khung go");
        }
        return null;
    }
}
