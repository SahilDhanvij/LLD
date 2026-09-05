package lld.elevator;

import java.util.TreeSet;

public class Elevator {
    private final int id;
    private final int maxFloor;

    private int currentFloor;
    private EnumDirection direction;
    private EnumEelvatorMode mode;

    private final TreeSet<Integer> upRequests;
    private final TreeSet<Integer> downRequests;
    
    public Elevator(int id, int startingFloor, int maxFloor) {
        this.id = id;
        this.maxFloor = maxFloor;
        this.currentFloor = startingFloor;
        this.direction = EnumDirection.NONE;
        this.mode = EnumEelvatorMode.IDLE;
        this.upRequests = new TreeSet<>();
        this.downRequests = new TreeSet<>();
    }

    public int getId() {
        return id;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public EnumDirection getDirection() {
        return direction;
    }
    public EnumEelvatorMode getMode() {
        return mode;
    }

    public void addFloorRequest(int floor) {
        if(floor < 1 || floor > maxFloor) {
            throw new IllegalArgumentException("Invalid floor number: " + floor);
        }
        if(floor==currentFloor) {
            openDoor();     
            return;
        }
        if (floor > currentFloor) {
            upRequests.add(floor);
        } else if(floor < currentFloor) {
            downRequests.add(floor);
        }
        if(direction == EnumDirection.NONE) {
            direction = (floor > currentFloor) ? EnumDirection.UP : EnumDirection.DOWN;
            mode = EnumEelvatorMode.MOVING;
        }
    }

    public void step() {
        if(mode == EnumEelvatorMode.EMERGENCY || mode == EnumEelvatorMode.MAINTENANCE) {
            return;
        }
        if(direction == EnumDirection.NONE){
            mode = EnumEelvatorMode.IDLE;
            return;
        }
        mode = EnumEelvatorMode.MOVING;
        if(direction == EnumDirection.UP){
            moveUp();
        }else if(direction == EnumDirection.DOWN){
            moveDown();
        }
    }

    private void moveUp() {
        currentFloor++;
        if(upRequests.contains(currentFloor)) {
            upRequests.remove(currentFloor);
            openDoor();
        }
        if(upRequests.isEmpty() && !downRequests.isEmpty()) {
            direction = EnumDirection.DOWN;
        } else if(upRequests.isEmpty() && downRequests.isEmpty()) {
            direction = EnumDirection.NONE;
            mode = EnumEelvatorMode.IDLE;
        }
    }

    private void moveDown() {
        currentFloor--;
        if(downRequests.contains(currentFloor)) {
            downRequests.remove(currentFloor);
            openDoor();
        }
        if(downRequests.isEmpty() && !upRequests.isEmpty()) {
            direction = EnumDirection.UP;
        } else if(downRequests.isEmpty() && upRequests.isEmpty()) {
            direction = EnumDirection.NONE;
            mode = EnumEelvatorMode.IDLE;
        }
    }
    private void openDoor(){
        mode = EnumEelvatorMode.DOOR_OPEN;
        System.out.println("Elevator " + id + " opening door at floor " + currentFloor);
        closeDoor();
    }
    private void closeDoor(){
        mode = EnumEelvatorMode.MOVING;
    }
    public void setMaintenance(boolean isMaintenance) {
        if(isMaintenance) {
            mode = EnumEelvatorMode.MAINTENANCE;
            direction = EnumDirection.NONE;
            upRequests.clear();
            downRequests.clear();
        } else {
            mode = EnumEelvatorMode.IDLE;
        }
    }
        @Override
    public String toString() {
        return "Elevator{" +
                "id=" + id +
                ", floor=" + currentFloor +
                ", direction=" + direction +
                ", mode=" + mode +
                '}';
    }
}
