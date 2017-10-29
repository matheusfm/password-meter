package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfCharactersMetricTest {
    private Metric metric;

    @Before
    public void setUp() {
        metric = new NumberOfCharactersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(" 1@aA[].,#$ ");
        assertEquals(12, n);
    }

    @Test
    public void zero() {
        int n = metric.count("");
        assertEquals(0, n);
    }

}