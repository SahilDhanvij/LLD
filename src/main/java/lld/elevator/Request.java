package lld.elevator;

public class Request {
    private final int floor;
    private final Direction direction; // null/IDLE for internal cabin requests

    public Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }
}
