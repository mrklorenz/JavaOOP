package com.company;

import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setIdNumber(2002101);
        student1.setName("Mark Lorenz B. Balajadia");
        student1.setAge(25);
        student1.setGender("Male");

        Student student2 = new Student(2002102, "Karyn Lou Garde", 25, "Female");

        System.out.println("Student ID.:\t" + student1.getIdNumber());
        System.out.println("Name.:\t\t\t" + student1.getName());
        System.out.println("Age:\t\t\t" + student1.getAge());
        System.out.println("Gender:\t\t\t" + student1.getGender());

        System.out.println();

        System.out.println("Student ID.:\t" + student2.getIdNumber());
        System.out.println("Name.:\t\t\t" + student2.getName());
        System.out.println("Age:\t\t\t" + student2.getAge());
        System.out.println("Gender:\t\t\t" + student2.getGender());
    }
}
