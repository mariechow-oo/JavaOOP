package JavaOOP.model;

public class Student {
    String name;
    int age;
    String gender;
    String idNo;

    public Student(String name, int age, String gender, String idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
