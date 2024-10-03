package ir.moghadaszadeh.creational.singleton;

public class SingletonPatternEx {
    public static void main(String[] args) {
        System.out.println("***** Singleton Pattern Demo *****\n");
        System.out.println("Trying to make a new DbConnection");
        DbConnection db1 = DbConnection.getInstance();
        System.out.println("Trying to make another DbConnection");
        DbConnection db2 = DbConnection.getInstance();
        if (db1 == db2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}
