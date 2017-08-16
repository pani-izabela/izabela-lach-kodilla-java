package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    TaskList taskList;

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getTasksFirst(){
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getTasksSecond(){
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getTasksThird(){
        return new TaskList();
    }

    @Bean
    public Board getBoard(){
        return new Board(taskList);
    }
}
