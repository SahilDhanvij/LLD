package lld.bookmyshow;

import java.util.List;

public class SeatLockManager {
    // TODO: pick a data structure to track held seats + when their hold expires
    // (e.g. Map<String seatId, Instant expiresAt>), plus a way to periodically
    // release expired holds (a scheduled task, or lazy check on access).

    public boolean holdSeats(Show show, List<String> seatIds) {
        // TODO: for each seat, atomically check AVAILABLE -> HELD.
        // If any seat isn't available, roll back the ones you already held
        // and return false. This is the concurrency-critical method.
        throw new UnsupportedOperationException("not implemented");
    }

    public void releaseSeats(Show show, List<String> seatIds) {
        // TODO: HELD -> AVAILABLE
        throw new UnsupportedOperationException("not implemented");
    }

    public void confirmSeats(Show show, List<String> seatIds) {
        // TODO: HELD -> BOOKED
        throw new UnsupportedOperationException("not implemented");
    }
}
