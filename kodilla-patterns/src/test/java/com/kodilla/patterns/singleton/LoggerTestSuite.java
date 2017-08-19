package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger loger;

    @BeforeClass
    public static void crateLoggerInstance() {
        Logger.getInstance().log("log1");
    }

    @Test
    public void testLog(){
        Logger.getInstance().log("log1");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Pobieram " + lastLog);
        //Then
        Assert.assertEquals("log1", lastLog);
    }
}
