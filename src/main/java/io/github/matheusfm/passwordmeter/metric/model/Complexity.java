package io.github.matheusfm.passwordmeter.metric.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Complexity {
    VERY_WEAK("Very Weak", 0, 20),
    WEAK("Weak", 20, 40),
    GOOD("Good", 40, 60),
    STRONG("Strong", 60, 80),
    VERY_STRONG("Verty Strong", 80, 100);

    private String name;
    private int min;
    private int max;

    public static Complexity getComplexity(int score) {
        for (Complexity c : values()) {
            if (score >= c.min && score < c.max)
                return c;
        }
        return null;
    }
}
