package lld.parkinglot.Strategies;

import lld.parkinglot.models.Ticket;

public class ExitGate {
    private ParkingManager parkingManager;
    private Computation computation;
    private Payment payment;

    public ExitGate(ParkingManager parkingManager, Computation computation, Payment payment) {
        this.parkingManager = parkingManager;
        this.computation = computation;
        this.payment = payment;
    }
    public void exitVehicle(Ticket ticket) {
        double amount = computation.calculatePrice(ticket);
        payment.pay(amount);
        parkingManager.removeVehicle(ticket.getParkingSpot());
    }
}
