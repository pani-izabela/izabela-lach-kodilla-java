package com.kodilla.stream.lambda;

public class Processor {
    ////metoda ta jako argument przyjmuje obiekt dowolnej klasy implementującej interfejs Executor (np. klasy ExecuteSaySomething)
    public void execute(Executor executor) {
        executor.process();
    }
}
