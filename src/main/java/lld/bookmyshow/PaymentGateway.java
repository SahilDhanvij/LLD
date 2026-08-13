package lld.bookmyshow;

public interface PaymentGateway {
    boolean charge(String userId, double amount);
}
