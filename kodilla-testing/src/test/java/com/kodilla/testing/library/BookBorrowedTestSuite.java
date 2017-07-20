package com.kodilla.testing.library;

import com.kodilla.testing.library.LibraryUser;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookBorrowedTestSuite {
    //ten test posłuży do sprawdzenia czy metoda listBooksInHands(LibraryUser libraryUser) zachowuje się poprawnie gdy ilość książek
    // wypozyczonych = 0
    @Test
    public void listBooksInHandsLess(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooksBorrowed = new ArrayList<Book>();
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "90123077888");

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBooksBorrowed);

        // When
        List<Book> theListOfBooksBorrowed = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(0, theListOfBooksBorrowed.size());
    }

    //ten test posłuży do sprawdzenia czy metoda listBooksInHands(LibraryUser libraryUser) zachowuje się poprawnie gdy ilość książek
    // wypozyczonych = 1
    @Test
    public void listBooksInHandsOne(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooksBorrowed = new ArrayList<Book>();
        Book book = new Book("Secrets of Alamo", "John Smith", 2008);
        resultListOfBooksBorrowed.add(book);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "90123077888");

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBooksBorrowed);

        // When
        List<Book> theListOfBooksBorrowed = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(1, theListOfBooksBorrowed.size());
    }

    //ten test posłuży do sprawdzenia czy metoda listBooksInHands(LibraryUser libraryUser) zachowuje się poprawnie gdy ilość książek
    // wypozyczonych = 5
    @Test
    public void listBooksInHandsFive(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooksBorrowed = new ArrayList<Book>();
        Book book1 = new Book("Tytuł1", "Autor1", 2008);
        Book book2 = new Book("Tytuł2", "Autor2", 2008);
        Book book3 = new Book("Tytuł3", "Autor3", 2008);
        Book book4 = new Book("Tytuł4", "Autor4", 2008);
        Book book5 = new Book("Tytuł5", "Autor5", 2008);
        resultListOfBooksBorrowed.add(book1);
        resultListOfBooksBorrowed.add(book2);
        resultListOfBooksBorrowed.add(book3);
        resultListOfBooksBorrowed.add(book4);
        resultListOfBooksBorrowed.add(book5);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "90123077888");

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser))
                .thenReturn(resultListOfBooksBorrowed);

        // When
        List<Book> theListOfBooksBorrowed = bookLibrary.listBooksInHandsOf(libraryUser);

        // Then
        assertEquals(5, theListOfBooksBorrowed.size());
    }

}
