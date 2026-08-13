package lld.parkinglot.Strategies;

import java.util.List;

import lld.parkinglot.models.ParkingSpot;
import lld.parkinglot.models.Vehicle;

public abstract class ParkingManager {
    protected List<ParkingSpot> parkingSpots;
    protected parkingStrategy strategy;

    public ParkingManager(List<ParkingSpot> parkingSpots, parkingStrategy strategy) {
        this.parkingSpots = parkingSpots;
        this.strategy = strategy;
    }

    public ParkingSpot findParkingSpot() {
        return strategy.findParkingspot(parkingSpots);
    }
    
    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot spot = findParkingSpot();
        if(spot!=null){
            spot.parkVehicle(vehicle);
            return spot;
        }else{
            throw new RuntimeException("No parking spot available");
        }
    }

    public void removeVehicle(ParkingSpot spot){
        spot.removeVehicle();
    }
}
