package com.kodilla.com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser(String username) {
        this.username = "John Smith";
    }
}
