package lld.elevator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Elevator e1 = new Elevator(1,0,9);
        Elevator e2 = new Elevator(2,0,2);
        Elevator e3 = new Elevator(3,0,5);

        List<Elevator> elevators = Arrays.asList(e1, e2, e3);
        ElevatorStrategy strategy = new NearestElevatorStrategy();
        ElevatorSystem elevatorSystem = new ElevatorSystem(elevators, strategy);
        elevatorSystem.requestElevator(3, EnumDirection.UP);
        elevatorSystem.selectFloor(1,9);

                // Simulate movement.
        for (int i = 0; i < 15; i++) {
            elevatorSystem.step();

            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e3);

            System.out.println("----------------");
        }
    }
}
