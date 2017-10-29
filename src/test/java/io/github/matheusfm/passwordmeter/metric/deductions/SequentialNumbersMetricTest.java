package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequentialNumbersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new SequentialNumbersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("!1 234 568%$");
        assertEquals(1, n);
    }

    @Test
    public void zero() {
        int n = metric.count("!1 23 4 568%$");
        assertEquals(0, n);
    }

}