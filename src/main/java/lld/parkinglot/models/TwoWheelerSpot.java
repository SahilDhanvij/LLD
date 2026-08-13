package lld.parkinglot.models;

public class TwoWheelerSpot extends ParkingSpot {
    public TwoWheelerSpot(int id) {
        super(id);
    }
    @Override
    public int price() {
        return 20;
    }
    
}
