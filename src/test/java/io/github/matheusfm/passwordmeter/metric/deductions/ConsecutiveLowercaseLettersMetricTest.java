package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveLowercaseLettersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new ConsecutiveLowercaseLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("abcAa1a*a b");
        assertEquals(3, n);
    }

    @Test
    public void zero() {
        int n = metric.count("a7cAa1a*a$ b");
        assertEquals(0, n);
    }

}