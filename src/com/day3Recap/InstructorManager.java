package com.day3Recap;

public class InstructorManager extends UserManager{
    public void releaseNewCourse(Course course){
        System.out.println("Yeni kurs yayınlandı: " + course.teacher + " " + course.name + " ₺" + course.price);
    }
}
