package ir.moghadaszadeh.creational.builder;

@SuppressWarnings("all")
public class Student {

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

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {

        private String firstname;
        private String lastname;
        private int age;

        public StudentBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public StudentBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(firstname, lastname, age);
        }
    }
}