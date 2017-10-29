package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsecutiveUppercaseLettersMetric implements Metric {
    private static final Pattern REGEX = Pattern.compile("([A-Z]{2,})");

    @Override
    public int count(String password) {
        Matcher matcher = REGEX.matcher(password.replaceAll("\\s", ""));
        int count = 0;
        while (matcher.find())
            count += (matcher.group().length() - 1);
        return count;
    }

    @Override
    public int rate(int n, int len) {
        return -(n * 2);
    }
}
