package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setNumber("j-121");
        student.setCreated(new Date());

        System.out.println(student.getFullName() + " study in a group " + student.getNumber() + " " + student.getCreated());
    }
}
