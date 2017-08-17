package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

        @Test
        public void testTaskAdd(){
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class); //tworzymy kontekst aplikacji

            //When
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            Board board1 = context.getBean(Board.class);//pobieramy z kontenera beana typu Board
            System.out.println(board1);
            TaskList toDoList = board1.getToDoList();
            toDoList.getTasks().add("task to do");

            TaskList inProgressList = board1.getInProgressList();
            inProgressList.getTasks().add("task in progress");

            TaskList doneList = board1.getDoneList();
            doneList.getTasks().add("done task");

            //Then
            Assert.assertEquals("task to do", board1.getToDoList().getTasks().get(0));
            Assert.assertEquals("task in progress", board1.getInProgressList().getTasks().get(0));
            Assert.assertEquals("done task", board1.getDoneList().getTasks().get(0));


    }
}
