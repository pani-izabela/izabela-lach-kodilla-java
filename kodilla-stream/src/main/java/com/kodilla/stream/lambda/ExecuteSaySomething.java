package com.kodilla.stream.lambda;

//przykładowa implementacja interfejsu Executor
public class ExecuteSaySomething implements Executor {
    @Override
    public void process() {
        System.out.println("This is an example text.");
    }
}
