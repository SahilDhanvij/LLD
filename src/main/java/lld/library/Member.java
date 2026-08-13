package lld.library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String memberId;
    private final String name;
    private final List<BookCopy> currentCheckouts = new ArrayList<>();
    private double feesOwed;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // TODO: getters, addCheckout/removeCheckout, addFee
}
