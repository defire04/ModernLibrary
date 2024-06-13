package com.example.library.model;

public class FictionBook extends BookPrototype {
    public FictionBook() {
    }

    @Override
    public FictionBook clone() {
        FictionBook clone = new FictionBook();
        clone.setTitle(this.title);
        clone.setAuthor(this.author);
        clone.setPublicationYear(this.publicationYear);
        clone.setGenre(this.genre);
        clone.setPrice(this.price);
        return clone;
    }
}
