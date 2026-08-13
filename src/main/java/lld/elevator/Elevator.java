package lld.elevator;

import java.util.TreeSet;

public class Elevator {
    private final int id;
    private int currentFloor;
    private Direction direction;
    private final TreeSet<Integer> upRequests = new TreeSet<>();
    private final TreeSet<Integer> downRequests = new TreeSet<>();

    public Elevator(int id, int startFloor) {
        this.id = id;
        this.currentFloor = startFloor;
        this.direction = Direction.IDLE;
    }

    public void addRequest(int floor) {
        // TODO: add to upRequests or downRequests based on floor vs currentFloor
        throw new UnsupportedOperationException("not implemented");
    }

    public void step() {
        // TODO: move one floor towards the next target following SCAN/LOOK
        // (keep going in current direction until no more requests that way,
        // then reverse), "open doors" when arriving at a requested floor.
        throw new UnsupportedOperationException("not implemented");
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
