package ir.moghadaszadeh.creational.abstractfactory;

@SuppressWarnings("unchecked")
public abstract class ShapeAbstractFactory {

    private static <T extends ShapeAbstractFactory> T newInstance(ShapeFactoryType shapeFactoryType) {
        ShapeAbstractFactory shapeAbstractFactory = null;
        switch (shapeFactoryType) {
            case SHAPE2D -> shapeAbstractFactory =  new Shape2dFactory();
            case SHAPE3D -> shapeAbstractFactory = new Shape3dFactory();
        }
        return (T) shapeAbstractFactory;
    }

    public static Shape2dFactory newShape2dFactory() {
        return newInstance(ShapeFactoryType.SHAPE2D);
    }

    public static Shape3dFactory newShape3dFactory() {
        return newInstance(ShapeFactoryType.SHAPE3D);
    }
}
