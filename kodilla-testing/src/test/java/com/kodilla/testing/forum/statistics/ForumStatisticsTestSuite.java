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
    public void testCalculateAdvStatistics(Statistics statistics){
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

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        int quantityOfUsers = forumStatistics.getQuantityUsers();


        //Then
        Assert.assertEquals(5, quantityOfUsers);

    }
}
