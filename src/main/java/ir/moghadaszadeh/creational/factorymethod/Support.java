package ir.moghadaszadeh.creational.factorymethod;

public class Support extends Staff {

    public Support(String name, String code, String subject) {
        super(name, code, subject);
    }

    @Override
    public String toString() {
        return "Support: " + super.subject;
    }
}
