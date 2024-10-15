package ir.moghadaszadeh.structural.adapter;

public class AdapterPatternEx {
    public static void main(String[] args) {
        System.out.println("***** Adapter Pattern Demo *****\n");
        StudentDto studentDto = new StudentDto(1, "Ali", "Moghadaszadeh");
        Student student = new StudentDtoAdapter(studentDto);
        System.out.println(student);
    }
}
