package model;

public class Student {
    private int idNumber;
    private String name;
    private int age;
    private String gender;

    public Student (){}

    public Student(int idNumber, String name, int age, String gender){
        this.idNumber = idNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
