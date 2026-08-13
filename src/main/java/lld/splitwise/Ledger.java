package lld.splitwise;

import java.util.Map;

public class Ledger {
    // TODO: pick a representation, e.g. Map<User, Map<User, Double>> balances,
    // where balances.get(A).get(B) = amount B owes A (positive) or A owes B (negative).

    public void recordExpense(Expense expense) {
        // TODO: apply expense.getSplitStrategy() to get each participant's share,
        // then update balances between paidBy and each participant.
        throw new UnsupportedOperationException("not implemented");
    }

    public double getBalanceBetween(User a, User b) {
        // TODO: positive = b owes a, negative = a owes b
        throw new UnsupportedOperationException("not implemented");
    }
}
