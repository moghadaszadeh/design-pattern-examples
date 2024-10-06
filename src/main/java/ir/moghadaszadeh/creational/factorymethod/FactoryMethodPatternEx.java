package ir.moghadaszadeh.creational.factorymethod;

public class FactoryMethodPatternEx {
    public static void main(String[] args) {
        System.out.println("***** Factory Method Pattern Demo *****\n");
        Sale sale = StaffFactory.getStaff("SAL-2321");
        System.out.println(sale);
    }
}
