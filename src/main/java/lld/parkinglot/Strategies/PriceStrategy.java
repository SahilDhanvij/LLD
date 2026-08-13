package lld.parkinglot.Strategies;

import lld.parkinglot.models.Ticket;

public interface PriceStrategy {
    double calculatePrice(Ticket ticket);
}
