package ir.moghadaszadeh.creational.factorymethod;

public class Technical extends Staff {

    public Technical(String name, String code, String subject) {
        super(name, code, subject);
    }

    @Override
    public String toString() {
        return "Technical: " + super.subject;
    }
}
