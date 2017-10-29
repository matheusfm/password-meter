package io.github.matheusfm.passwordmeter.metric.model;

public interface Metric {
    int count(String password);

    int rate(int n, int len);
}
