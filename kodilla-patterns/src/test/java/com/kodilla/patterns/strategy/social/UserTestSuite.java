package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){ //sprawdza czy domyślnie utworzone obiekty generujące wpisy w mediach społecznościowych są poprawne
        //Given
        User young = new Millenials("Adam");
        User younger = new YGeneration("Franek");
        User theYoungest = new ZGeneration("Kacper");

        //When
        String youngPublish = young.sharePost();
        System.out.println("Młody użytkownik z grupy Milenials używa: " + youngPublish);
        String youngerPublish = younger.sharePost();
        System.out.println("Młodszy użytkownik  z grupy YGenertion używa: " + youngerPublish);
        String theYoungestPublish = theYoungest.sharePost();
        System.out.println("Najmłodszy użytkownik z grupy ZGeneration używa: " + theYoungestPublish);

        //Then
        Assert.assertEquals("Facebook", youngPublish);
        Assert.assertEquals("Twitter", youngerPublish);
        Assert.assertEquals("Snapchat", theYoungestPublish);

    }

    @Test
    public void testIndividualSharingStrategy(){ //sprawdza czy możliwa jest indywidualna zmiana upodobań użytkownika
        //Given
        User young = new Millenials("Adam");

        //When
        String youngPublish = young.sharePost();
        System.out.println("Adam używa " + youngPublish);
        young.setSocialPublisher(new TwitterPublisher());
        youngPublish = young.sharePost();
        System.out.println("Adam używa " + youngPublish);


        //Then
        Assert.assertEquals("Twitter", youngPublish);
    }
}
