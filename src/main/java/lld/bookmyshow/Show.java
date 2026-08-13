package lld.bookmyshow;

import java.time.LocalDateTime;
import java.util.List;

public class Show {
    private final String showId;
    private final String movieTitle;
    private final LocalDateTime startTime;
    private final List<Seat> seats;

    public Show(String showId, String movieTitle, LocalDateTime startTime, List<Seat> seats) {
        this.showId = showId;
        this.movieTitle = movieTitle;
        this.startTime = startTime;
        this.seats = seats;
    }

    // TODO: getters, findSeat(seatId)
}
