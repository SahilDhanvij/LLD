package lld.library;

public class BookCopy {
    public enum Status { AVAILABLE, CHECKED_OUT, RESERVED, LOST }

    private final String copyId;
    private final Book book;
    private Status status;

    public BookCopy(String copyId, Book book) {
        this.copyId = copyId;
        this.book = book;
        this.status = Status.AVAILABLE;
    }

    // TODO: getters/setters with valid-transition checks
}
