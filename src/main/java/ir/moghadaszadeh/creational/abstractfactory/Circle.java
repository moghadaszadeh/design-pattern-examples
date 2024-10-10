package ir.moghadaszadeh.creational.abstractfactory;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle created.");
    }
}
