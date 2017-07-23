package com.kodilla.stream.forum;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String nameUser;
    private char sex = 'M'/'F';
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final int userId, final String nameUser, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, char sex, final int posts) {
        this.userId = userId;
        this.nameUser = nameUser;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.posts = posts;
    }

    public int getUserId() {
        return userId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        //LocalDate localDate = ;
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }



    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
