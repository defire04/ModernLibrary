package com.example.library;

public abstract class BookProcessor {
    public final void processBook() {
        selectBook();
        readBook();
        summarizeBook();
    }
    protected abstract void selectBook();
    protected abstract void readBook();
    protected abstract void summarizeBook();
}
