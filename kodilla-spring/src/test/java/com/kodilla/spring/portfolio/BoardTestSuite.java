package com.kodilla.spring.portfolio;


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
            //TaskList taskList1 = board1.getToDoList();
            //System.out.println(taskList1);



            //Then



    }
}
