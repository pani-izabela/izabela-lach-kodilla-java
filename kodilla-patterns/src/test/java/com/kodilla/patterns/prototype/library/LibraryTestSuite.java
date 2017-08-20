package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        Book book1 = new Book("Vademecum historyka starożytnej Grecji i Rzymu", "Ewa Wipszycka", LocalDate.of(1972, 1, 1));
        Book book2 = new Book("Historia Rzymu", "Adam Ziółkowski", LocalDate.of(2004, 1, 1));
        Book book3 = new Book("Starożytna Sparta", "Ryszard Kulesza", LocalDate.of(2003, 1, 1));
        Library library1 = new Library("Biblioteka Wydzialu Historycznego UW");
        library1.getBooks().add(book1);
        library1.getBooks().add(book2);
        library1.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library1.shallowCopy();
            clonedLibrary.setName("Biblioteka Wydziału Archeologii UW");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //System.out.println(library1);
        //System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library1.deepCopy();
            deepClonedLibrary.setName("Biblioteka Wydziału Historii Sztuki UW");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library1.getBooks().remove(book1);
        //Then
        System.out.println(library1);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library1.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library1.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library1.getBooks());
    }
}
