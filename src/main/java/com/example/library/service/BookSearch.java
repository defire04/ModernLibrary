package com.example.library.service;

import com.example.library.model.Book;

import java.util.List;

interface BookSearch {
    List<Book> searchByTitle(String title);
    List<Book> searchByAuthor(String author);
}

