package ir.moghadaszadeh.creational.abstractfactory;

@SuppressWarnings("unchecked")
public class Shape2dFactory extends ShapeAbstractFactory {

    private <T extends Shape> T newInstance(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CIRCLE -> shape = new Circle();
            case RECTANGLE -> shape = new Rectangle();
        }
        return (T) shape;
    }

    public Circle newCircleInstance() {
        return newInstance(ShapeType.CIRCLE);
    }

    public Rectangle newRectangleInstance() {
        return newInstance(ShapeType.RECTANGLE);
    }
}
