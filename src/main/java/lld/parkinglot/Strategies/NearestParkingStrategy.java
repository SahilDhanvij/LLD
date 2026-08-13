package lld.parkinglot.Strategies;

import java.util.List;

import lld.parkinglot.models.ParkingSpot;

public class NearestParkingStrategy implements parkingStrategy {
    @Override
    public ParkingSpot findParkingspot(List<ParkingSpot> spots) {
        for(ParkingSpot spot : spots){
            if(spot.isEmpty()){
                return spot;
            }
        }
        return null;
    }
}
 