package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.FictionBook;
import com.example.library.model.NonFictionBook;
import com.example.library.repository.BookRepository;
import com.example.library.repository.InMemoryBookRepository;
import com.example.library.service.LibraryService;

import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookRepository bookRepository = new InMemoryBookRepository();
        LibraryService libraryService = new LibraryService(bookRepository);

        Book fictionBook = new FictionBook("1984", "George Orwell", 1949, 15.99);
        Book nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", 2011, 20.99);

        libraryService.addBook(fictionBook);
        libraryService.addBook(nonFictionBook);

        System.out.println("Books by George Orwell:");
        List<Book> orwellBooks = libraryService.searchByAuthor("George Orwell");
        for (Book book : orwellBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        System.out.println("Books titled '1984':");
        List<Book> books1984 = libraryService.searchByTitle("1984");
        for (Book book : books1984) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        libraryService.removeBook(fictionBook);

        System.out.println("Books by George Orwell after removal:");
        orwellBooks = libraryService.searchByAuthor("George Orwell");
        for (Book book : orwellBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}













