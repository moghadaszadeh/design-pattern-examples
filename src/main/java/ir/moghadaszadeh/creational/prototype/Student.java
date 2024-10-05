package ir.moghadaszadeh.creational.prototype;

import lombok.Builder;

@Builder
public class Student implements Prototype {

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
    public Prototype getClone() {
        return new Student(firstname, lastname, age);
    }
}