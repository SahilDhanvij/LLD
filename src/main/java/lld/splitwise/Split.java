package lld.splitwise;

import java.util.List;
import java.util.Map;

public interface Split {
    /**
     * @return each participant's owed share, summing to the total expense amount.
     */
    Map<User, Double> apply(double totalAmount, List<User> participants);
}
