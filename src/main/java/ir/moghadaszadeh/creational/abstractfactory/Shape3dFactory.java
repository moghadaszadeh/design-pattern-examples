package ir.moghadaszadeh.creational.abstractfactory;

@SuppressWarnings("unchecked")
public class Shape3dFactory extends ShapeAbstractFactory {

    private <T extends Shape> T newInstance(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case CUBE -> shape = new Cube();
            case SPHERE -> shape = new Sphere();
        }
        return (T) shape;
    }

    public Cube newCubeInstance() {
        return newInstance(ShapeType.CUBE);
    }

    public Sphere newCylinderInstance() {
        return newInstance(ShapeType.SPHERE);
    }
}
