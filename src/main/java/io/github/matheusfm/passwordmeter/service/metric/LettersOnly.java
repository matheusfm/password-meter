package io.github.matheusfm.passwordmeter.service.metric;

public class LettersOnly implements Metric {
    @Override
    public int occurrences(String password) {
        return password.matches("^[a-zA-Z]*$") ? password.length() : 0;
    }

    @Override
    public int bonus(int occurrences, int length) {
        return -occurrences;
    }
}
