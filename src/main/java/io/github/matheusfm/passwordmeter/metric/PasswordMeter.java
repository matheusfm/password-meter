package io.github.matheusfm.passwordmeter.metric;

import io.github.matheusfm.passwordmeter.metric.model.Complexity;
import io.github.matheusfm.passwordmeter.metric.model.Metric;
import io.github.matheusfm.passwordmeter.metric.model.PasswordStrength;
import io.github.matheusfm.passwordmeter.metric.requirement.Requirement;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PasswordMeter {
    @Getter
    private List<Metric> metrics;
    @Getter
    private Requirement requirement;

    public PasswordMeter(Requirement requirement) {
        this.requirement = requirement;
        this.metrics = new ArrayList<>();
        this.metrics.add(requirement);
    }

    public void addMetric(Metric metric) {
        metrics.add(metric);
    }

    public void addMetric(List<Metric> metrics) {
        this.metrics.addAll(metrics);
    }

    private int score(String password) {
        int len = password.length();
        int score = 0;
        for (Metric m : this.metrics) {
            int n = m.count(password);
            int bonus = m.rate(n, len);
            score += bonus;
        }
        return checkRange(score);
    }

    private int checkRange(int score) {
        if (score < 0)
            return 0;
        else if (score > 100)
            return 100;
        else
            return score;
    }

    public PasswordStrength measure(String password) {
        int score = score(password);
        return new PasswordStrength(score + " %", Complexity.getComplexity(score));
    }
}
