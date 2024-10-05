package ir.moghadaszadeh.creational.prototype;

import lombok.Builder;

@Builder
public class Student implements prototype {

    private String firstname;
    private String lastname;
    private int age;

    public Student(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public prototype getClone() {
        return new Student(firstname, lastname, age);
    }
}