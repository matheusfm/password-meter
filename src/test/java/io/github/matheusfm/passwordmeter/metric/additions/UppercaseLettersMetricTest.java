package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UppercaseLettersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new UppercaseLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("{AAa@Bb5Cc*Dd} ");
        assertEquals(5, n);
    }

    @Test
    public void zero() {
        int n = metric.count("{a@b5c*d} ");
        assertEquals(0, n);
    }

}