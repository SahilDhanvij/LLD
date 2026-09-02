package lld.elevator;

import java.util.List;

public class ElevatorController {
    private final List<Elevator> elevators;
    private final ElevatorStrategy strategy;

    public ElevatorController(List<Elevator> elevators, ElevatorStrategy strategy) {
        this.elevators = elevators;
        this.strategy = strategy;
    }
    public void requestElevator(int floor, EnumDirection direction) {
        ElevatorRequest request = new ElevatorRequest(floor, direction);
        Elevator selectedElevator = strategy.selectElevator(elevators, request);
        if(selectedElevator == null){
            throw new RuntimeException("No available elevators to handle the request.");
        }

        System.out.println(
                "Assigning elevator " +
                selectedElevator.getId() +
                " to floor " +
                floor
        );

        selectedElevator.addFloorRequest(floor);
    }

    public void step() {
        for(Elevator elevator : elevators) {
            elevator.step();
        }
    }

    public Elevator getElevatorStatus(int id) {
        for(Elevator elevator : elevators) {
            if(elevator.getId() == id) {
                return elevator;
            }
        }
        throw new IllegalArgumentException("Elevator with ID " + id + " not found.");
    }
    
}
