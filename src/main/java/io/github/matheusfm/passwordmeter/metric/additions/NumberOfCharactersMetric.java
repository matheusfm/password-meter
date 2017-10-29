package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

public class NumberOfCharactersMetric implements Metric {
    @Override
    public int count(String password) {
        return password.length();
    }

    @Override
    public int rate(int n, int len) {
        return +(n * 4);
    }
}
