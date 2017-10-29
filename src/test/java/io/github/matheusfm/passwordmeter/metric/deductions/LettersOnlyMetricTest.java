package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LettersOnlyMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new LettersOnlyMetric();
    }

    @Test
    public void count() {
        int n = metric.count(" aSdfgHj ");
        assertEquals(9, n);
    }

    @Test
    public void zero() {
        int n = metric.count("aSdfgHj1");
        assertEquals(0, n);
    }

}