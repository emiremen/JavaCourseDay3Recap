package com.day3Recap;

public class Student extends User{
    int courseProgress;
    String[] completedCourses;

    public Student(int id, String name, String surname, String mail, String password, int courseProgress) {
        super(id, name, surname, mail, password);
        this.courseProgress = courseProgress;
    }
}
