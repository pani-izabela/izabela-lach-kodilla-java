package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listNamesUsers = new ArrayList<String>();
        listNamesUsers.add("Jurek");
        listNamesUsers.add("Marek");
        listNamesUsers.add("Felek");
        listNamesUsers.add("Arek");
        listNamesUsers.add("Ola");
        when(statisticsMock.usersNames()).thenReturn(listNamesUsers);

        int posts = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 30;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When - wywołuję metodę, którą testuję
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        int quantityOfUsers = forumStatistics.getQuantityUsers();
        Assert.assertEquals(5, quantityOfUsers);

    }
    @Test
    public void testCalculateAdvStatisticsPostsCommentsUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listNamesUsers = new ArrayList<String>();
        for(int n = 0; n < 100; n++){
            listNamesUsers.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(listNamesUsers);

        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        int quantityOfPosts = forumStatistics.getQuantityPosts();
        Assert.assertEquals(1000, quantityOfPosts);
        int quantityOfComments = forumStatistics.getQuantityComments();
        Assert.assertEquals(0, quantityOfComments);
        int quantityOfUsers = forumStatistics.getQuantityUsers();
        Assert.assertEquals(100, quantityOfUsers);
        Assert.assertTrue(quantityOfPosts > quantityOfComments);

    }

    @Test
    public void testCalculateAdvStatisticsPostsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listNamesUsers = new ArrayList<String>();
        for(int n = 0; n < 100; n++){
            listNamesUsers.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(listNamesUsers);

        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        int quantityOfPosts = forumStatistics.getQuantityPosts();
        Assert.assertEquals(0, quantityOfPosts);

    }

    @Test
    public void testCalculateAdvStatisticsUsersZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listNamesUsers = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(listNamesUsers);

        int posts = 50;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 100;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        int quantityOfUsers = forumStatistics.getQuantityUsers();
        Assert.assertEquals(0, quantityOfUsers);

    }
    @Test
    public void testCalculateAdvStatisticsLessMore(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> listNamesUsers = new ArrayList<String>();
        for(int n = 0; n < 100; n++){
            listNamesUsers.add("User"+n);
        }

        when(statisticsMock.usersNames()).thenReturn(listNamesUsers);

        int posts = 10;
        when(statisticsMock.postsCount()).thenReturn(posts);

        int comments = 50;
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);


        //Then
        int quantityOfPosts = forumStatistics.getQuantityPosts();
        //Assert.assertEquals(1000, quantityOfPosts);
        int quantityOfComments = forumStatistics.getQuantityComments();
        //Assert.assertEquals(0, quantityOfComments);
        Assert.assertTrue(quantityOfPosts < quantityOfComments);

    }



}
