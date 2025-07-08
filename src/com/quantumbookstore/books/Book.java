package com.quantumbookstore.books;

public abstract  class  Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public abstract boolean isAvailable();

    public abstract void purchase(int quantity, String email, String address);

    public String getInfo() {
        return String.format("[ISBN: %s, Title: %s, Year: %d, Price: %.2f, Author: %s]",
                isbn, title, year, price, author);
    }

    @Override
    public String toString() {
        return "Quantum book store - " + getInfo();
    }

}