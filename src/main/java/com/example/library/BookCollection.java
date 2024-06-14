package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Iterable<Book> {
    private final List<Book> books;

    public BookCollection() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator<Book> {
        private int index;

        public BookIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }
}