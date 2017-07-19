package com.kodilla.testing.forum.statistics;


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
        int quantityUsers = statistics.usersNames().size();
        int quantityPosts = statistics.postsCount();
        int quantityComments = statistics.commentsCount();
        double avarageQuantityPostsUser = (statistics.postsCount() / statistics.usersNames().size());
        double avarageQuantityCommentsUser = (statistics.commentsCount() / statistics.usersNames().size());
        double avarageQuantityCommentsPost = (statistics.commentsCount() / statistics.postsCount());
    }

    public String ShowStatistics(){
        return null;
    }

}
