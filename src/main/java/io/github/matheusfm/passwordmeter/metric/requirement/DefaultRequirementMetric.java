package io.github.matheusfm.passwordmeter.metric.requirement;

import io.github.matheusfm.passwordmeter.metric.model.Metric;

import java.util.List;

public class DefaultRequirementMetric extends Requirement {

    public DefaultRequirementMetric(List<Metric> requiredMetrics) {
        super(requiredMetrics);
    }

    @Override
    public int count(String password) {
        int length = password.length();

        int satisfiedRequiredMetrics = 0;
        for (Metric m : requiredMetrics) {
            if (m.count(password) > 0)
                satisfiedRequiredMetrics++;
        }

        boolean lengthSatisfied = length >= 8;

        int count = satisfiedRequiredMetrics;
        if (lengthSatisfied)
            count++;

        boolean satisfied = lengthSatisfied && satisfiedRequiredMetrics >= 3;

        return satisfied ? count : 0;
    }

    @Override
    public int rate(int n, int len) {
        return +(n * 2);
    }
}
