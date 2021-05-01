package com.day3Recap;

public class StudentManager extends UserManager{
    public void courseComplete(Student student){
        System.out.println("Tebrikler! Kursu %" + student.courseProgress + " tamamladınız: ");
    }
    public void addCourseProgress(Student student){
        if (student.courseProgress < 100) {
            student.courseProgress += 5;
            System.out.println("Kursu %" + student.courseProgress + " tamamladınız.");
        }else{
            courseComplete(student);
        }
    }
}
