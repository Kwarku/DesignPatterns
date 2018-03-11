package pl.narodzinyprogramisty.Strategy;

import java.math.BigDecimal;

public class PLTaxStrategy implements TaxStrategy {
    private final double tax = 0.23;

    @Override
    public BigDecimal countTax(BigDecimal cash) {
        return cash.multiply(BigDecimal.valueOf(tax));
    }
}
