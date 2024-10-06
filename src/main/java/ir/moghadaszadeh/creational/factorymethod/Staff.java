package ir.moghadaszadeh.creational.factorymethod;

public abstract class Staff {

    protected String name;
    protected String code;
    protected String subject;

    public Staff(String name, String code, String subject) {
        this.name = name;
        this.code = code;
        this.subject = subject;
    }
}
