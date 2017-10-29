package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequentialLettersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new SequentialLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("!AaBc deG%$");
        assertEquals(1, n);
    }

    @Test
    public void zero() {
        int n = metric.count("!Aa Bc deG%$");
        assertEquals(0, n);
    }

}