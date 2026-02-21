package org.ravi.model;

import org.ravi.enums.BookStatus;

public class BookItem {
    private String barcode;
    private Book book;
    private BookStatus status;

    public BookItem(String barcode, Book book, BookStatus status) {
        this.barcode = barcode;
        this.book = book;
        this.status = status;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
