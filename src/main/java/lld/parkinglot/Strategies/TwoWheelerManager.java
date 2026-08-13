package lld.parkinglot.Strategies;

import java.util.List;

import lld.parkinglot.models.ParkingSpot;

public class TwoWheelerManager extends ParkingManager {
    public TwoWheelerManager(List<ParkingSpot> spots, parkingStrategy strategy) {
        super(spots, strategy);
    }
}
