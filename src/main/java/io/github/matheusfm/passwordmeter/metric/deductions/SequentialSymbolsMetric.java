package io.github.matheusfm.passwordmeter.metric.deductions;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

public class SequentialSymbolsMetric implements Metric {
    private static final String SYMBOLS = "!@#$%^&*()";

    @Override
    public int count(String password) {
        int count = 0;
        for (int i = 0; i < (SYMBOLS.length() - 3); i++) {
            String fwd = SYMBOLS.substring(i, i + 3);
            String rev = new StringBuilder(fwd).reverse().toString();
            if (password.toLowerCase().contains(fwd) || password.toLowerCase().contains(rev))
                count++;
        }
        return count;
    }

    @Override
    public int rate(int n, int len) {
        return -(n * 3);
    }
}
