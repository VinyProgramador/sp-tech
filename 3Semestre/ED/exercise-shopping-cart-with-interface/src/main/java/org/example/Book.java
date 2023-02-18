package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class Book extends Product {
    private String name;
    private String author;
    private String isbn;

    public Book(Integer code, Double priceCost, String name, String author, String isbn) {
        super(code, priceCost);
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public Double getSaleValue() {
        return (getPriceCost() * 0.10) + getPriceCost();
    }


    @Override
    public String toString() {
        return "Book = " +
                "name = " + name + '\'' +
                ", author = " + author + '\'' +
                ", isbn = " + isbn + '\'' +
                ", SaleValue = " + getSaleValue() + "\n"
                + super.toString();
    }
}
