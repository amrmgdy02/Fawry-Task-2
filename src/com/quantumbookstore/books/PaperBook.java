package com.quantumbookstore.books;

import  com.quantumbookstore.services.ShippingService;

public class PaperBook extends Book{
    private int stock;

    public PaperBook(String isbn, String title, int year,
                     double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public void purchase(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Quantum book store - Not enough stock for PaperBook");
        }
        stock -= quantity;
        System.out.printf("Quantum book store - Paper book purchased: %d x %s, Total: %.2f%n",
                quantity, title, price * quantity);
        ShippingService.sendPaperBook(address);
    }


}