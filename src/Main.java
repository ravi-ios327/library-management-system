import org.ravi.enums.BookStatus;
import org.ravi.model.Book;
import org.ravi.model.BookItem;
import org.ravi.model.Member;
import org.ravi.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Book book = new Book(
                "Java Basics",
                "James Gosling",
                "Programming", "9780135166307");
        BookItem bookItem = new BookItem("BC101", book, BookStatus.AVAILABLE);
        Member member = new Member("M1", "Ravi");
        libraryService.addBookItems(bookItem);
        libraryService.addMembers(member);
        libraryService.issueBook(bookItem.getBarcode(), member.getMemberId());
        libraryService.returnBook("BC102", "M1");
    }
}