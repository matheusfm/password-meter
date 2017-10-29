package io.github.matheusfm.passwordmeter.metric.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PasswordStrength {
    private String score;
    private String complexity;
}
