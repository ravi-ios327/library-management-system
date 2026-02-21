package org.ravi.service;

import org.ravi.model.BookItem;
import org.ravi.model.Member;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    private Map<String, BookItem> bookItemMap = new HashMap<>();
    private Map<String, Member> memberMap = new HashMap<>();
    private IssueService issueService = new IssueService();

    public void addBookItems(BookItem bookItem){
    bookItemMap.put(bookItem.getBarcode(), bookItem);
    }

    public void addMembers(Member member){
        memberMap.put(member.getMemberId(), member);
    }

    public BookItem searchBook(String barcode){
        return bookItemMap.get(barcode);
    }

    public Member getMember(String memberId){
        return memberMap.get(memberId);
    }

    public void issueBook(String barcode, String memberId){
        issueService.issueBook(bookItemMap.get(barcode), memberMap.get(memberId));
    }

    public void returnBook(String barcode, String memberId){
        issueService.returnBook(bookItemMap.get(barcode), memberMap.get(memberId));
    }
}