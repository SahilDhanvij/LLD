package lld.parkinglot.Strategies;

import lld.parkinglot.models.ParkingSpot;
import lld.parkinglot.models.Ticket;
import lld.parkinglot.models.Vehicle;

public class EntranceGate {
    private ParkingManager parkingManager;

    public EntranceGate(ParkingManager parkingManager) {
        this.parkingManager = parkingManager;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = parkingManager.parkVehicle(vehicle);
        if(spot != null) {
            return new Ticket(new java.util.Date(), vehicle, spot);
        } else {
            throw new RuntimeException("No parking spot available");
        }
    } 
}
