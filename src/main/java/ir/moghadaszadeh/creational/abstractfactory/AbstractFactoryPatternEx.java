package ir.moghadaszadeh.creational.abstractfactory;

public class AbstractFactoryPatternEx {
    public static void main(String[] args) {
        System.out.println("***** Abstract Factory Pattern Demo *****\n");
        System.out.println("Trying to make a new Rectangle");
        Shape2dFactory shape2dFactory = ShapeAbstractFactory.newShape2dFactory();
        Rectangle rectangle = shape2dFactory.newRectangleInstance();
        rectangle.draw();
        System.out.println("Trying to make a new Cube");
        Shape3dFactory shape3dFactory = ShapeAbstractFactory.newShape3dFactory();
        Cube cube = shape3dFactory.newCubeInstance();
        cube.draw();
    }
}
