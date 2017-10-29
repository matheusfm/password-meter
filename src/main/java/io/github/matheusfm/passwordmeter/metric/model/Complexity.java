package io.github.matheusfm.passwordmeter.metric.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Complexity {
    VERY_WEAK("Muito fraco", 0, 20),
    WEAK("Fraco", 20, 40),
    GOOD("Bom", 40, 60),
    STRONG("Forte", 60, 80),
    VERY_STRONG("Muito Forte", 80, 101);

    private String name;
    private int min;
    private int max;

    public static String getComplexity(int score) {
        for (Complexity c : values()) {
            if (score >= c.min && score < c.max)
                return c.name;
        }
        return null;
    }
}
