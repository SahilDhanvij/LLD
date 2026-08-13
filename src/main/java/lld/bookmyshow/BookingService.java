package lld.bookmyshow;

import java.util.List;

public class BookingService {
    private final SeatLockManager lockManager;
    private final PaymentGateway paymentGateway;

    public BookingService(SeatLockManager lockManager, PaymentGateway paymentGateway) {
        this.lockManager = lockManager;
        this.paymentGateway = paymentGateway;
    }

    public boolean bookSeats(String userId, Show show, List<String> seatIds, double totalAmount) {
        // TODO: hold seats -> charge payment -> confirm seats on success,
        // or release seats on payment failure. Think about what happens if
        // the hold times out mid-payment.
        throw new UnsupportedOperationException("not implemented");
    }
}
