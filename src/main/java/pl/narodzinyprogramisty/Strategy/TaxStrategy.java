package pl.narodzinyprogramisty.Strategy;

import java.math.BigDecimal;

public interface TaxStrategy {
    BigDecimal countTax(BigDecimal cash);

}
