package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequentialSymbolsMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new SequentialSymbolsMetric();
    }

    @Test
    public void count() {
        int n = metric.count("1! @#$ %^*1A");
        assertEquals(1, n);
    }

    @Test
    public void zero() {
        int n = metric.count("1! @a#$ %^*1A");
        assertEquals(0, n);
    }

}