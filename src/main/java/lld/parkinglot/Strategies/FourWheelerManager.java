package lld.parkinglot.Strategies;

import java.util.List;

import lld.parkinglot.models.ParkingSpot;

public class FourWheelerManager extends ParkingManager {
    public FourWheelerManager(List<ParkingSpot> spots, parkingStrategy strategy) {
        super(spots, strategy);
    }
    
}
