package ir.moghadaszadeh.creational.prototype;

public class PrototypePatternEx {
    public static void main(String[] args) {
        System.out.println("***** Prototype Pattern Demo *****\n");
        System.out.println("Trying to make a new Student");
        Student student1 = Student.builder().firstname("Ali").lastname("Moghadaszadeh").age(40).build();
        System.out.println("Student1 hash code: " + student1.hashCode());
        System.out.println("Trying to make a new Student with clone method");
        Student student2 = (Student) student1.getClone();
        System.out.println("Student2 hash code: " + student2.hashCode());
    }
}
