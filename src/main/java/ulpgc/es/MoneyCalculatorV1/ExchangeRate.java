package ulpgc.es.MoneyCalculatorV1;

import java.time.LocalDate;
import java.util.StringJoiner;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final LocalDate date;
    private final double rate;


    public ExchangeRate(Currency from, Currency to, LocalDate date, double rate) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ExchangeRate.class.getSimpleName() + "[", "]")
                .add("from=" + from)
                .add("to=" + to)
                .add("date=" + date)
                .add("rate=" + rate)
                .toString();
    }
}
