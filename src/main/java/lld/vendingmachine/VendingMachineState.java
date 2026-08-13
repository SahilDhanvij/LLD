package lld.vendingmachine;

public interface VendingMachineState {
    void selectProduct(String productCode);
    void insertCoin(int valueInCents);
    void dispense();
    void cancel();
}
