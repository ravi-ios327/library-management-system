package org.ravi.service;

import org.ravi.enums.BookStatus;
import org.ravi.model.BookItem;
import org.ravi.model.IssueRecord;
import org.ravi.model.Member;

import java.util.ArrayList;
import java.util.List;

public class IssueService {

    private List<IssueRecord> records = new ArrayList<>();

    public boolean issueBook(BookItem bookItem, Member member) {
        if (bookItem.getStatus() != BookStatus.AVAILABLE) {
            System.out.println("Book not available");
            return false;
        }
        IssueRecord issueRecord = new IssueRecord(bookItem, member);
        records.add(issueRecord);
        bookItem.setStatus(BookStatus.ISSUED);
        System.out.println("Book issued successfully");
        return true;
    }

    public boolean returnBook(BookItem bookItem, Member member) {
        for (IssueRecord record : records) {
            if (record.getBookItem().equals(bookItem) &&
                    record.getMember().equals(member) &&
                    record.getReturnDate() == null) {
                record.returnBook();
                bookItem.setStatus(BookStatus.AVAILABLE);
                System.out.println("Book returned successfully");
                return true;
            }
        }
        System.out.println("No active issue record found");
        return false;
    }

    public List<BookItem> getIssuedBook(Member member) {
        List<BookItem> issuedBooks = new ArrayList<>();
        for (IssueRecord record : records) {
            if (record.getMember().equals(member) && record.getReturnDate() == null) {
                issuedBooks.add(record.getBookItem());
            }
        }
        return issuedBooks;
    }
}
