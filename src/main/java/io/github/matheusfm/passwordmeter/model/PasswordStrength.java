package io.github.matheusfm.passwordmeter.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PasswordStrength {
    private String score;
    private String complexity;
}
