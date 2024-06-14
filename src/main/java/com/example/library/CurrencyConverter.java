package com.example.library;


public class CurrencyConverter implements Visitor {
    private static final double USD_RATE = 1.0;
    private static final double EUR_RATE = 0.85;

    @Override
    public void visitFictionBook(FictionBook book) {
        double priceUSD = convertToUSD(book.getPrice());
        System.out.println("Fiction Book: " + book.getTitle() + ", Price in USD: " + priceUSD);
    }

    @Override
    public void visitNonFictionBook(NonFictionBook book) {
        double priceUSD = convertToUSD(book.getPrice());
        System.out.println("Non-Fiction Book: " + book.getTitle() + ", Price in USD: " + priceUSD);
    }

    public double convertToUSD(double price) {
        return price * USD_RATE;
    }

    public double convertToEUR(double price) {
        return price * EUR_RATE;
    }
}
