package dev.bogdanbalalau.bookstore.entity;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private String description;
    private Double price;

    public Book(Integer id, String title, String author, String description, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Title: %s, Author: %s, Description: %s, Price: %f", id, title, author, description, price);
    }
}
