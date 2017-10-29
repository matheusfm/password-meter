package io.github.matheusfm.passwordmeter.metric.requirement;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

import java.util.List;

public abstract class Requirement implements Metric {
    protected List<Metric> requiredMetrics;

    public Requirement(List<Metric> requiredMetrics) {
        this.requiredMetrics = requiredMetrics;
    }
}
