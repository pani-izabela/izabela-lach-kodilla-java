package com.kodilla.testing.forum.statistics;


import java.util.List;

public class ForumStatistics {
    int quantityUsers;
    int quantityPosts;
    int quantityComments;
    double avarageQuantityPostsUser;
    double avarageQuantityCommentsUser;
    double avarageQuantityCommentsPost;

    public ForumStatistics() {
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public int getQuantityPosts() {
        return quantityPosts;
    }

    public int getQuantityComments() {
        return quantityComments;
    }

    public double getAvarageQuantityPostsUser() {
        return avarageQuantityPostsUser;
    }

    public double getAvarageQuantityCommentsUser() {
        return avarageQuantityCommentsUser;
    }

    public double getAvarageQuantityCommentsPost() {
        return avarageQuantityCommentsPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.quantityUsers = statistics.usersNames().size();
        this.quantityPosts = statistics.postsCount();
        this.quantityComments = statistics.commentsCount();
        this.avarageQuantityPostsUser = (statistics.postsCount() / statistics.usersNames().size());
        this.avarageQuantityCommentsUser = (statistics.commentsCount() / statistics.usersNames().size());
        this.avarageQuantityCommentsPost = (statistics.commentsCount() / statistics.postsCount());
    }

    public String ShowStatistics(){
        //ForumStatistics statistics = new ForumStatistics();
        String allProperties = ("Liczba użytkowników: " + getQuantityUsers() +
                " Liczba postów: " + getQuantityPosts() +
                " Liczba komentarzy: " + getQuantityComments() +
                " Srednia liczba postów na użytkownika: " + getAvarageQuantityPostsUser() +
                " Srednia liczba komentarzy na użytkownika: " + getAvarageQuantityCommentsUser() +
                " Srednia liczba komentarzy na post: " + getAvarageQuantityCommentsPost());
        return allProperties;
    }

}
