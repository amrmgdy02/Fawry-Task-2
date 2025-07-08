package com.quantumbookstore.books;

import com.quantumbookstore.services.MailService;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public void purchase(int quantity, String email, String address) {
        if (quantity > 1) {
            throw new IllegalArgumentException("Quantum book store - EBooks can only be bought one at a time");
        }
        System.out.printf("Quantum book store - EBook purchased: %s, Total: %.2f%n", title, price);
        MailService.sendEBook(email);
    }
}
