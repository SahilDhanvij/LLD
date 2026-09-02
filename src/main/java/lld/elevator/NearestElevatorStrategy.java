package lld.elevator;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorStrategy {
    @Override
    public Elevator selectElevator(List<Elevator> elevators, ElevatorRequest request){
        Elevator nearestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for(Elevator elevator : elevators){
            if(elevator.getMode() == EnumEelvatorMode.EMERGENCY || elevator.getMode() == EnumEelvatorMode.MAINTENANCE) {
                continue;
            }
            int distance = Math.abs(elevator.getCurrentFloor() - request.getFloor());
            boolean directionMatch = (elevator.getDirection() == request.getDirection()) || (elevator.getDirection() == EnumDirection.NONE);
            if(directionMatch) {
                distance -= 1; 
            }
            if(distance < minDistance) {
                minDistance = distance;
                nearestElevator = elevator;
            }
        }
        return nearestElevator;
    }
}

