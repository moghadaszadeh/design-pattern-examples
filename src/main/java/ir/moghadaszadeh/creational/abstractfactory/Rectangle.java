package ir.moghadaszadeh.creational.abstractfactory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle created.");
    }
}
