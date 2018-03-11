package pl.narodzinyprogramisty;

import org.assertj.core.data.Offset;
import org.assertj.core.data.Percentage;
import org.junit.Before;
import org.junit.Test;
import pl.narodzinyprogramisty.Strategy.PLTaxStrategy;
import pl.narodzinyprogramisty.Strategy.TaxContext;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {
    private TaxContext taxContext;


    @Before
    public void setUp() {
        taxContext = new TaxContext();
    }

    @Test
    public void test() {
        BigDecimal temp;
        taxContext.setTaxStrategy(new PLTaxStrategy());
        temp = taxContext.count(BigDecimal.valueOf(1000));

        assertThat(temp.intValue()).isEqualTo(230);
        assertThat(temp.doubleValue()).isCloseTo(230, Percentage.withPercentage(2));

    }
}
