package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

public class LettersOnlyMetric implements Metric {
    private static final String REGEX = "^[a-zA-Z]*$";

    @Override
    public int count(String password) {
        return password.matches(REGEX) ? password.length() : 0;
    }

    @Override
    public int rate(int n, int len) {
        return -n;
    }
}
