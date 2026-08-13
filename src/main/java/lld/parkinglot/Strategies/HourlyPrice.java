package lld.parkinglot.Strategies;

import lld.parkinglot.models.Ticket;

public class HourlyPrice implements PriceStrategy {
    @Override
    public double calculatePrice(Ticket ticket) {
        return 50.0;
    }
    
}
