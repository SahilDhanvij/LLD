package lld.vendingmachine;

import java.util.Map;

public class VendingMachine {
    private VendingMachineState currentState;
    private final Map<String, Product> inventory;
    private int balanceInCents;

    public VendingMachine(Map<String, Product> inventory) {
        this.inventory = inventory;
        // TODO: initialize currentState to an "Idle" state implementation
    }

    // TODO: expose selectProduct/insertCoin/dispense/cancel that delegate to
    // currentState, and a setState(...) the state classes can call to transition.
}
