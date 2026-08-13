package lld.parkinglot.models;

import java.util.Date;

public class Ticket {
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Ticket(Date entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    
}
