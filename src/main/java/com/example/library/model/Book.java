package com.example.library.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;
    private boolean available;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.publicationYear = builder.publicationYear;
        this.genre = builder.genre;
        this.price = builder.price;
        this.available = builder.available;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private int publicationYear;
        private String genre;
        private double price;
        private boolean available;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setPublicationYear(int year) {
            this.publicationYear = year;
            return this;
        }

        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public BookBuilder setAvailable(boolean available) {
            this.available = available;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
