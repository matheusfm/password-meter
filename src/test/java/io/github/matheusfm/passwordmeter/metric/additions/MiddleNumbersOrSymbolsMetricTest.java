package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleNumbersOrSymbolsMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new MiddleNumbersOrSymbolsMetric();
    }

    @Test
    public void count() {
        int n = metric.count(" 0  Aa1Bb* 0 ");
        assertEquals(2, n);
    }

    @Test
    public void zero() {
        int n = metric.count("*aA0");
        assertEquals(0, n);
    }

}