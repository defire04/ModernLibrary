package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.FictionBook;
import com.example.library.model.NonFictionBook;
import com.example.library.service.BookService;
import com.example.library.service.FictionBookService;
import com.example.library.service.NonFictionBookService;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookService fictionBookService = new FictionBookService();
        BookService nonFictionBookService = new NonFictionBookService();

        Book fictionBook = new FictionBook(fictionBookService);
        Book nonFictionBook = new NonFictionBook(nonFictionBookService);

        System.out.println(fictionBook.open());
        System.out.println(fictionBook.close());

        System.out.println(nonFictionBook.open());
        System.out.println(nonFictionBook.close());
    }
}
