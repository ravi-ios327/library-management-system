package org.ravi.model;

import java.time.LocalDate;

public class IssueRecord {

    private BookItem bookItem;
    private Member member;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public IssueRecord(BookItem bookItem, Member member) {
        this.bookItem = bookItem;
        this.member = member;
        this.issueDate = LocalDate.now();
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public Member getMember() {
        return member;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
