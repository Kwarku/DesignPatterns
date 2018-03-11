package pl.narodzinyprogramisty.Strategy;

import java.math.BigDecimal;

public class TaxContext {
    private TaxStrategy strategy;

    public void setTaxStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal count(BigDecimal cash) {
        return strategy.countTax(cash);
    }
}
