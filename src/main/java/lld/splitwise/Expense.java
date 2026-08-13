package lld.splitwise;

import java.util.List;

public class Expense {
    private final User paidBy;
    private final double amount;
    private final List<User> participants;
    private final Split splitStrategy;

    public Expense(User paidBy, double amount, List<User> participants, Split splitStrategy) {
        this.paidBy = paidBy;
        this.amount = amount;
        this.participants = participants;
        this.splitStrategy = splitStrategy;
    }

    // TODO: getters
}
