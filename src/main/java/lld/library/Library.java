package lld.library;

import java.util.List;
import java.util.Map;

public class Library {
    private final Map<String, Book> catalog;          // isbn -> Book
    private final Map<String, List<BookCopy>> copies;  // isbn -> copies

    public Library(Map<String, Book> catalog, Map<String, List<BookCopy>> copies) {
        this.catalog = catalog;
        this.copies = copies;
    }

    public BookCopy checkout(String isbn, Member member) {
        // TODO: find an AVAILABLE copy, mark CHECKED_OUT, record on member.
        // If none available, decide: throw, return null, or add to a hold queue.
        throw new UnsupportedOperationException("not implemented");
    }

    public void returnBook(BookCopy copy, Member member) {
        // TODO: mark AVAILABLE (or RESERVED if there's a pending hold),
        // remove from member's checkouts, apply late fee if overdue.
        throw new UnsupportedOperationException("not implemented");
    }
}
