package ulpgc.es.MoneyCalculatorV1;

import java.util.StringJoiner;

public class Money {
    private final double amount;
    private final Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Money.class.getSimpleName() + "[", "]")
                .add("amount=" + amount)
                .add("currency=" + currency)
                .toString();
    }
}
