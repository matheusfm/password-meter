package io.github.matheusfm.passwordmeter.configuration;

import io.github.matheusfm.passwordmeter.metric.model.Metric;
import io.github.matheusfm.passwordmeter.metric.PasswordMeter;
import io.github.matheusfm.passwordmeter.metric.additions.*;
import io.github.matheusfm.passwordmeter.metric.deductions.*;
import io.github.matheusfm.passwordmeter.metric.requirement.DefaultRequirementMetric;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MetricConfiguration {
    @Bean
    public PasswordMeter passwordMeter() {
        List<Metric> requirementMetrics = new ArrayList<>();
        requirementMetrics.add(new UppercaseLettersMetric());
        requirementMetrics.add(new LowercaseLettersMetric());
        requirementMetrics.add(new NumbersMetric());
        requirementMetrics.add(new SymbolsMetric());
        DefaultRequirementMetric requirement = new DefaultRequirementMetric(requirementMetrics);
        PasswordMeter meter = new PasswordMeter(requirement);
        meter.addMetric(requirementMetrics);
        meter.addMetric(new NumberOfCharactersMetric());
        meter.addMetric(new MiddleNumbersOrSymbolsMetric());
        meter.addMetric(new LettersOnlyMetric());
        meter.addMetric(new NumbersOnlyMetric());
        meter.addMetric(new ConsecutiveUppercaseLettersMetric());
        meter.addMetric(new ConsecutiveLowercaseLettersMetric());
        meter.addMetric(new ConsecutiveNumbersMetric());
        meter.addMetric(new SequentialLettersMetric());
        meter.addMetric(new SequentialNumbersMetric());
        meter.addMetric(new SequentialSymbolsMetric());
        meter.addMetric(new RepeatCharactersMetric());
        return meter;
    }
}