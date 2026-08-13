package lld.parkinglot.models;

public abstract class ParkingSpot {
    protected int id;
    protected boolean isEmpty;
    protected Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
        this.isEmpty = true;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public void parkVehicle(Vehicle v){
        vehicle = v;
        isEmpty = false;
    }
    public void removeVehicle(){
        vehicle = null;
        isEmpty = true;
    }

    abstract int price();
}
