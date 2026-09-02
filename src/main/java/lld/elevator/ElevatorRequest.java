package lld.elevator;

public class ElevatorRequest {
    private final int floor;
    private final EnumDirection direction;
    
    public ElevatorRequest(int floor, EnumDirection direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }

    public EnumDirection getDirection() {
        return direction;
    }
    
}
