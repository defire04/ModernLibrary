package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Subject {
    private final List<Observer> observers;
    private Book book;

    public BookStore() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    public void setBook(Book book) {
        this.book = book;
        notifyObservers();
    }
}
