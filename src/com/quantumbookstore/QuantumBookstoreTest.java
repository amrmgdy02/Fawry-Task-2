package com.quantumbookstore;

import com.quantumbookstore.books.*;
import com.quantumbookstore.store.Bookstore;

import java.util.List;

public class QuantumBookstoreTest {
    public static void main(String[] args) {
        Bookstore store = new Bookstore();

        // Populate the store
        Book paper1 = new PaperBook("P001", "Clean Code", 2010, 250.0, "Robert C. Martin", 5);
        Book ebook1 = new EBook("E001", "Deep Learning", 2018, 180.0, "Ian Goodfellow", "PDF");
        Book demo1 = new ShowcaseBook("D001", "Quantum Theory", 2005, "Dirac");

        System.out.println("--- Adding Books ---");
        store.addBook(paper1);
        store.addBook(ebook1);
        store.addBook(demo1);

        System.out.println("\n--- Displaying Current Inventory ---");
        store.displayInventory();

        System.out.println("\n--- Buying EBook ---");
        store.buyBook("E001", 1, "amr@gmail.com", null);

        System.out.println("\n--- Buying Paper Book ---");
        store.buyBook("P001", 2, "amr@gmail.com", "123 Main St, Cairo");

        // Buying a demo book will throw an error
        System.out.println("\n--- Trying to buy Demo Book ---");
        try {
            store.buyBook("D001", 1, "amr@gmail.com", "123 Main St");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Remove outdated books
        System.out.println("\n--- Removing outdated books (older than 10 years) ---");
        List<Book> removed = store.removeOutdatedBooks(10);
        System.out.println("Quantum book store - Total removed: " + removed.size());

        System.out.println("\n--- Final Inventory ---");
        store.displayInventory();
    }
}
