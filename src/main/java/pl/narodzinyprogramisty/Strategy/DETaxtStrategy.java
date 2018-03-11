package pl.narodzinyprogramisty.Strategy;

import java.math.BigDecimal;

public class DETaxtStrategy implements TaxStrategy {
    private final double tax = 0.30;


    @Override
    public BigDecimal countTax(BigDecimal cash) {
        return cash.multiply(BigDecimal.valueOf(tax));
    }
}
