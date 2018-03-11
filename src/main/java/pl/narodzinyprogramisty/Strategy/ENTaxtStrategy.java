package pl.narodzinyprogramisty.Strategy;

import java.math.BigDecimal;

public class ENTaxtStrategy implements TaxStrategy {
    private final double tax = 0.20;

    @Override
    public BigDecimal countTax(BigDecimal cash) {
        return cash.multiply(BigDecimal.valueOf(tax));
    }
}
