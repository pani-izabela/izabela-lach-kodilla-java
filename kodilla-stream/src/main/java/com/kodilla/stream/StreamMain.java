package com.kodilla.stream;

//import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.UserOfForum;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;

import java.util.stream.Collectors;
import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {
        /*System.out.println("Welcome to module 7 - Stream");
        SaySomething saySomething = new SaySomething();
        saySomething.say();*/

        /*//obiekt processor będzie odpowiedzialny za uruchamianie
        //obiektów klas implemetujących interfejs Executor (tu executeSaySomething)
        //przekazywanych do metody execute(Executor executor)
        Processor processor = new Processor();
        //tworzymy obiekt klasy implementującej interfejs Executor
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //wywołujemy metodę execute(Executor executor) klasy Processor, której za pośrednictwem argumentu przekazujemy obiekt
        processor.execute(executeSaySomething);
        //do klasy Processor przekazaliśmy nie tylko tekst do wyświetlenia (tekst "This is an example text." metody process(), klasy ExecuteSaySomething)
        //ale też kod, który ma być wykonany (metodę execute() klasy Processor).

        //Czyli przekazalismy zarówno metodę execute() klasy Processor(pusta metoda), ale też metodę process(), klasy ExecuteSaySomething
        //(wyświetla tekst) za pomocą stworzonego obiektu executeSaySomething*/

        //obiekt processor odpowiedzialny jest za wykonywanie kodu, który zostanie przekazany jako parametr (czyli codeToExecute)
        Processor processor = new Processor();
        //przypisywane do zmiennej codeToExecute wrażenia lambda
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        //metoda execute klasy Processor, która jako argument otrzymuje wyrażenie lambda codeToExecute
        processor.execute(codeToExecute);
        // da się też to tak processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //-----------------------------------------------------------------------------------
        // Zadanie 7.1 - Upiększacz tekstów
        PoemBeautifier poemBeautifier1 = new PoemBeautifier();
        poemBeautifier1.beautify("Ślachetne zdrowie, ",(text) -> "ABC " + text + " ABC");

        PoemBeautifier poemBeautifier2 = new PoemBeautifier();
        poemBeautifier2.beautify("Nikt się nie dowie, ", (text) -> text.toUpperCase());
        //PoemBeautifier poemBeautifier2 = new PoemBeautifier();
        //PoemDecorator poemDecorator = (text) -> text.toUpperCase();
        //poemBeautifier2.beautify("Nikt się nie dowie, ", poemDecorator);

        PoemBeautifier poemBeautifier3 = new PoemBeautifier();
        poemBeautifier3.beautify("Jako smakujesz,", (text) -> text.replace(text , "Jajo posmakujesz"));
        //PoemBeautifier poemBeautifier3 = new PoemBeautifier();
        //PoemDecorator poemDecorator1 = (text) -> text.replace(text , "Jajo posmakujesz");
        //poemBeautifier3.beautify("Jako smakujesz,", poemDecorator1);

        PoemBeautifier poemBeautifier4 = new PoemBeautifier();
        poemBeautifier4.beautify("I się zepsujesz.", (text) -> text.concat(" / autor: Jan Kochanowski :)"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        //----------------------------------------7.3---------------------------------------------------
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        /*BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        //-----------------------------ZADANIE 7.3 ----------------------------

        Forum forum = new Forum();
        Map<Integer, UserOfForum> resultMapOfUsers = forum.getUserList().stream()
                //.filter(forumUser -> forumUser.getNameUser().equals("Iza"))
                //.filter(userOfForum -> userOfForum.getSex().compareTo('M'))
                //.filter(forumUser -> forumUser.getDateOfBirth() < 1997-12-31)
                .filter(userOfForum -> userOfForum.getPosts()>0)
                .collect(Collectors.toMap(UserOfForum::getUserId, userOfForum -> userOfForum));

        System.out.println("Liczba elementów: " + resultMapOfUsers.size());
        resultMapOfUsers.entrySet().stream()
                .map(entry -> "Id usera: " + entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}