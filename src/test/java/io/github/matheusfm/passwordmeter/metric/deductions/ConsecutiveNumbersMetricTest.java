package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new ConsecutiveNumbersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("$1 2 3 4a5*6");
        assertEquals(3, n);
    }

    @Test
    public void zero() {
        int n = metric.count("$1 .2 .3 .4a5*6");
        assertEquals(0, n);
    }

}