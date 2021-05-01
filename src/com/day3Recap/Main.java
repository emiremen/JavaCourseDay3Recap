package com.day3Recap;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(7,"muhammed","emen","muhammed@emen.com","123", 90);
        Instructor instructor = new Instructor(4,"engin","demiroğ","engin@demirog.com","112233", "Yazılım");

        User[] users = new User[]{student,instructor};

        UserManager userManager = new UserManager();
        for (User user : users) {
            userManager.login(user);
        }

        StudentManager studentManager = new StudentManager();
        studentManager.addCourseProgress(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.releaseNewCourse(new Course(2,"Python", "Engin Demiroğ",0));


    }
}
