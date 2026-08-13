package lld.elevator;

import java.util.List;

public class ElevatorController {
    private final List<Elevator> elevators;

    public ElevatorController(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public void handleExternalRequest(Request request) {
        // TODO: pick the "best" elevator for this request (e.g. nearest one
        // already heading the right direction, or nearest idle one) and
        // call addRequest on it.
        throw new UnsupportedOperationException("not implemented");
    }
}
