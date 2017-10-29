package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowercaseLettersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new LowercaseLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("{Aaa@Bb5Cc*Dd} ");
        assertEquals(5, n);
    }

    @Test
    public void zero() {
        int n = metric.count("{A@B5C*D} ");
        assertEquals(0, n);
    }

}