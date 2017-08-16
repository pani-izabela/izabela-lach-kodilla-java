package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Configuration;

import java.util.List;

public class Board {
    private List<TaskList> toDoList;
    private List<TaskList> inProgressList ;
    private List<TaskList> doneList;

    public Board(List<TaskList> toDoList, List<TaskList> inProgressList, List<TaskList> doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public List<TaskList> getToDoList() {
        return toDoList;
    }

    public List<TaskList> getInProgressList() {
        return inProgressList;
    }

    public List<TaskList> getDoneList() {
        return doneList;
    }


}
