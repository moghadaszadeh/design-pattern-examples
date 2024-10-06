package ir.moghadaszadeh.creational.factorymethod;

public class Sale extends Staff {

    public Sale(String name, String code, String subject) {
        super(name, code, subject);
    }

    @Override
    public String toString() {
        return "Sale: " + super.subject;
    }
}
