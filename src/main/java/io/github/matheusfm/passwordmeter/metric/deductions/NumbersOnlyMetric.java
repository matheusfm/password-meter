package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

public class NumbersOnlyMetric implements Metric {
    private static final String REGEX = "^[\\d\\s]*$";

    @Override
    public int count(String password) {
        return password.matches(REGEX) ? password.length() : 0;
    }

    @Override
    public int rate(int n, int len) {
        return -n;
    }
}
