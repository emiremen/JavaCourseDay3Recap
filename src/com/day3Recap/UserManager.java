package com.day3Recap;

public class UserManager {
    public void login(User user){
        System.out.println("Giriş yaptı: " + user.name);
    }
    public void addComment(Comment comment){
        System.out.println("Yorumunuz gönderindi: " + comment.comment);
    }
}
