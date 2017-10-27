package io.github.matheusfm.passwordmeter.service.metric;

public class NumbersOnly implements Metric {
    @Override
    public int occurrences(String password) {
        return password.matches("^\\d*$") ? password.length() : 0;
    }

    @Override
    public int bonus(int occurrences, int length) {
        return -occurrences;
    }
}
