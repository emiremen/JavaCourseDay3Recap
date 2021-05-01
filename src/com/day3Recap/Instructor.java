package com.day3Recap;

public class Instructor extends User{
    String branch;

    public Instructor(int id, String name, String surname, String mail, String password, String branch) {
        super(id, name, surname, mail, password);
        this.branch = branch;
    }
}
