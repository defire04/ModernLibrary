package com.example.library.repository;

import com.example.library.model.Book;

import java.util.List;

public interface BookRepository {
    void save(Book book);
    void delete(Book book);
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
}

