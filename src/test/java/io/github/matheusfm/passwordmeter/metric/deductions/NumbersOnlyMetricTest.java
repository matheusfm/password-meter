package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersOnlyMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new NumbersOnlyMetric();
    }

    @Test
    public void count() {
        int n = metric.count(" 1234567890 ");
        assertEquals(12, n);
    }

    @Test
    public void zero() {
        int n = metric.count("1234567890a");
        assertEquals(0, n);
    }

}