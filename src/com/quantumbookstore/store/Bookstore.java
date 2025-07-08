package com.quantumbookstore.store;

import com.quantumbookstore.books.Book;

import java.util.*;

public class Bookstore {
    private Map<String, Book> inventory;

    public Bookstore() {
        inventory = new HashMap<>();
    }

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store - Added: " + book.getInfo());
    }

    public List<Book> removeOutdatedBooks(int maxAge) {
        List<Book> removedBooks = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            Book book = entry.getValue();
            if ((currentYear - book.getYear()) > maxAge) {
                removedBooks.add(book);
                iterator.remove();
                System.out.println("Quantum book store - Removed outdated book: " + book.getInfo());
            }
        }
        return removedBooks;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);

        if (book == null) {
            throw new IllegalArgumentException("Quantum book store - Book with ISBN " + isbn + " not found");
        }

        if (!book.isAvailable()) {
            throw new IllegalStateException("Quantum book store - Book is not available for purchase");
        }

        book.purchase(quantity, email, address);
        return book.getPrice() * quantity;
    }

    // To be used in testing
    public void displayInventory() {
        System.out.println("Quantum book store - Current Inventory:");
        for (Book book : inventory.values()) {
            System.out.println(" - " + book.getInfo());
        }
    }
}
