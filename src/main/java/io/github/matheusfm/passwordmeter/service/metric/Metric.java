package io.github.matheusfm.passwordmeter.service.metric;

public interface Metric {
    int occurrences(String password);
    int bonus(int occurrences, int length);
}
