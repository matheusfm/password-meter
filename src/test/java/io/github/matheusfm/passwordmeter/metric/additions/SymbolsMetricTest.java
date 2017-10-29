package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SymbolsMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new SymbolsMetric();
    }

    @Test
    public void count() {
        int n = metric.count("{Aaa@Bb5Cc*Dd} 2/_^~[];.,<>");
        assertEquals(15, n);
    }

    @Test
    public void zero() {
        int n = metric.count("2Aaa1BbCc5D9d 0");
        assertEquals(0, n);
    }

}