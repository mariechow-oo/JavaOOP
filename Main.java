package JavaOOP;

import JavaOOP.model.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("marie", 18, "f", "123");
        System.out.println(s.getName() + s.getAge() + s.getGender() + s.getIdNo());
    }
}
