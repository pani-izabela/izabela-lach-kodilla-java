package com.kodilla.stream.forum;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<UserOfForum> listForumUsers = new ArrayList<>();
    public Forum(){
        listForumUsers.add(new UserOfForum(1, "Adam", 1997, 12,13, 'M', 13));
        listForumUsers.add(new UserOfForum(2, "Bartek", 1990, 2,10, 'M', 4));
        listForumUsers.add(new UserOfForum(3, "Cecylia", 1987, 4,11, 'F', 0));
        listForumUsers.add(new UserOfForum(4, "Darek", 1981, 1, 19, 'M', 2));
        listForumUsers.add(new UserOfForum(5, "Ewa", 1999, 10,26, 'F', 8));
        listForumUsers.add(new UserOfForum(6, "Felek", 2000, 9, 13, 'M', 19));
        listForumUsers.add(new UserOfForum(7, "Gienia", 2001, 10, 11, 'F', 0));
        listForumUsers.add(new UserOfForum(8, "Henio", 1999, 11, 21, 'M', 2));
        listForumUsers.add(new UserOfForum(9, "Iza", 1999, 5, 5, 'F', 3));
        listForumUsers.add(new UserOfForum(10, "Justyna", 1998, 1, 5, 'M', 53));
        listForumUsers.add(new UserOfForum(11, "Krzys", 1997, 5,12, 'M', 0));
        listForumUsers.add(new UserOfForum(12, "Leon", 1996, 8,9, 'M', 10));
    }

    public List<UserOfForum> getUserList(){
        return new ArrayList<>(listForumUsers);
    }
}
