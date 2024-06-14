package com.example.library;

public interface Visitor {
    void visitFictionBook(FictionBook book);
    void visitNonFictionBook(NonFictionBook book);
}