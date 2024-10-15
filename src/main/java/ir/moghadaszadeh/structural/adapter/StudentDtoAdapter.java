package ir.moghadaszadeh.structural.adapter;

public class StudentDtoAdapter extends Student {

    public StudentDtoAdapter(StudentDto studentDto) {
        super(studentDto.getId(), String.valueOf(studentDto.getId()), studentDto.getFirstname() + " " + studentDto.getLastname(), "");
    }
}
