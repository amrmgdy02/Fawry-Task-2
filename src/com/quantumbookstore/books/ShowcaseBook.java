package com.quantumbookstore.books;

public class ShowcaseBook extends Book {

    public ShowcaseBook(String isbn, String title, int year, String author) {
        super(isbn, title, year, 0.0, author);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void purchase(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store - Showcase books are not for sale");
    }
}
