package lld.elevator;

import java.util.List;

public class ElevatorSystem {
    private final ElevatorController controller;
    public ElevatorSystem(List<Elevator> elevators, ElevatorStrategy strategy) {
        this.controller = new ElevatorController(elevators, strategy);
    }

    public void requestElevator(int floor, EnumDirection direction) {
        controller.requestElevator(floor, direction);
    }

    public void selectFloor(int elevatorID, int floor){
        Elevator elevator = controller.getElevatorStatus(elevatorID);
        if(elevator == null) {
            throw new IllegalArgumentException("Elevator with ID " + elevatorID + " not found.");
        }
        elevator.addFloorRequest(floor);
    }

    public void step() {
        controller.step();
    }

}
