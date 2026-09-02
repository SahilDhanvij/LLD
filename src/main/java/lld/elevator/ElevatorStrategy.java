package lld.elevator;

import java.util.List;

public interface ElevatorStrategy {
    Elevator selectElevator(List<Elevator> elevators, ElevatorRequest request);
}
