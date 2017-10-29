package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveUppercaseLettersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new ConsecutiveUppercaseLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("ABCaA1A*A B");
        assertEquals(3, n);
    }

    @Test
    public void zero() {
        int n = metric.count("A7CaA1A*A$ B");
        assertEquals(0, n);
    }

}