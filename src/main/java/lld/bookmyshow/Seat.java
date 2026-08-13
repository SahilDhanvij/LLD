package lld.bookmyshow;

public class Seat {
    public enum Status { AVAILABLE, HELD, BOOKED }
    public enum Category { REGULAR, PREMIUM }

    private final String seatId;
    private final Category category;
    private Status status;

    public Seat(String seatId, Category category) {
        this.seatId = seatId;
        this.category = category;
        this.status = Status.AVAILABLE;
    }

    // TODO: getters + a synchronized-safe way to transition status
}
