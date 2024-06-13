package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BookPrototype implements Prototype {
    protected String title;
    protected String author;
    protected int publicationYear;
    protected String genre;
    protected double price;


    @Override
    public abstract BookPrototype clone();
}
