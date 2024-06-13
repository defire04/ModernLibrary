package com.example.library.model;

public class NonFictionBook extends BookPrototype {
    public NonFictionBook() {
    }

    @Override
    public NonFictionBook clone() {
        NonFictionBook clone = new NonFictionBook();
        clone.setTitle(this.title);
        clone.setAuthor(this.author);
        clone.setPublicationYear(this.publicationYear);
        clone.setGenre(this.genre);
        clone.setPrice(this.price);
        return clone;
    }
}
