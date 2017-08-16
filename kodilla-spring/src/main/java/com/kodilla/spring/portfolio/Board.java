package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    private List<TaskList> toDoList;
    private List<TaskList> inProgressList ;
    private List<TaskList> doneList;

    public Board(TaskList taskList) {
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
