package io.github.matheusfm.passwordmeter.metric.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PasswordStrength {
    @Getter
    private String score;
    private Complexity complexity;

    public String getComplexity() {
        return complexity.getName();
    }
}
