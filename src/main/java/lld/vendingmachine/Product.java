package lld.vendingmachine;

public class Product {
    private final String code;
    private final String name;
    private final int priceInCents;
    private int quantity;

    public Product(String code, String name, int priceInCents, int quantity) {
        this.code = code;
        this.name = name;
        this.priceInCents = priceInCents;
        this.quantity = quantity;
    }

    // TODO: getters + decrementQuantity(), with validation
}
