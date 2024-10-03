package ir.moghadaszadeh.creational.builder;

public class BuilderPatternEx {
    public static void main(String[] args) {
        System.out.println("***** Builder Pattern Demo *****\n");
        Student student = Student
                .builder()
                .firstname("Ali")
                .lastname("Moghadaszadeh")
                .age(40)
                .build();
        System.out.println(student);
    }
}