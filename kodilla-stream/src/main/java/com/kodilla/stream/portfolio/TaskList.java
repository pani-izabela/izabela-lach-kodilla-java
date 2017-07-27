package com.kodilla.stream.portfolio;

import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(final String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return new LinkedList<>(tasks); //metoda tworzy nową listę używając konstruktora kopiującego
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }
}
