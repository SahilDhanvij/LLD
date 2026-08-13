package lld.parkinglot.models;

public class FourWheelerSpot extends ParkingSpot {
    public FourWheelerSpot(int id) {
        super(id);
    }
    @Override
    public int price() {
        return 40;
    }
}