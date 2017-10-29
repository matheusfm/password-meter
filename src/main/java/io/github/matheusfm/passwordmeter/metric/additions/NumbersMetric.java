package io.github.matheusfm.passwordmeter.metric.additions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersMetric implements Metric {
    private static final Pattern REGEX = Pattern.compile("([\\d]+)");

    @Override
    public int count(String password) {
        Matcher matcher = REGEX.matcher(password);
        int count = 0;
        while (matcher.find())
            count += matcher.group().length();
        return count;
    }

    @Override
    public int rate(int n, int len) {
        return (n * 4);
    }
}
