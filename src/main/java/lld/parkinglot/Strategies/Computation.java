package lld.parkinglot.Strategies;

import lld.parkinglot.models.Ticket;

public class Computation {
    private PriceStrategy priceStrategy;
    public Computation(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }
    public double calculatePrice(Ticket ticket){
        return priceStrategy.calculatePrice(ticket);
    }
}
