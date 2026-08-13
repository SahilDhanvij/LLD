package lld.parkinglot.Strategies;

import java.util.List;

import lld.parkinglot.models.ParkingSpot;

public interface parkingStrategy {
    ParkingSpot findParkingspot(List<ParkingSpot> spots);
}
