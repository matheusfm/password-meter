package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new NumbersMetric();
    }

    @Test
    public void count() {
        int n = metric.count("{Aaa@Bb5Cc*Dd} 2");
        assertEquals(2, n);
    }

    @Test
    public void zero() {
        int n = metric.count("{Aaa@Bb/Cc*Dd} /");
        assertEquals(0, n);
    }

}