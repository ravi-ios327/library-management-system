package org.ravi.model;

public class Book {
    private String title;
    private String author;
    private String subject;
    private String isbn;

    public Book(String title, String author, String subject, String isbn) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.isbn = isbn;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
