package io.github.matheusfm.passwordmeter.service;

import io.github.matheusfm.passwordmeter.model.PasswordStrength;
import org.springframework.stereotype.Service;

@Service
public class PasswordMeterService {
    private static final String ALPHAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERICS = "01234567890";
    private static final String SYMBOLS = ")!@#$%^&*()";

    public PasswordStrength measureStrength(String password) {
        return new PasswordStrength("0%", "Muito curta");
    }

    // Deductions

    private int lettersOnly(String password) {
        return password.matches("^[a-zA-Z]*$") ? password.length() : 0;
    }

    private int numbersOnly(String password) {
        return password.matches("^\\d*$") ? password.length() : 0;
    }

    public int repeatCharacters(String password) {
        int occurrences = 0;
        int length = password.length();
        for (int i = 0; i < length; i++) {
            char current = password.charAt(i);
            char next = password.charAt(i + 1);
            if (current == next)
                occurrences++;
        }
        return occurrences;
    }

    private int consecutiveUppercaseLetters(String password) {
        //TODO
        return 0;
    }

    private int consecutiveLowercaseLetters(String password) {
        //TODO
        return 0;
    }

    private int consecutiveNumbers(String password) {
        //TODO
        return 0;
    }

    private int sequentialLetters(String password) {
        //TODO 3+
        return 0;
    }

    private int sequentialNumbers(String password) {
        //TODO 3+
        return 0;
    }

    private int sequentialSymbols(String password) {
        //TODO 3+
        return 0;
    }

    // Additions
    private int numberOfCharacters(String password) {
        //TODO
        return 0;
    }

    private int uppercaseLetters(String password) {
        //TODO
        return 0;
    }

    private int lowercaseLetters(String password) {
        //TODO
        return 0;
    }

    private int numbers(String password) {
        //TODO
        return 0;
    }

    private int symbols(String password) {
        //TODO
        return 0;
    }

    private int middleNumberOrSymbols(String password) {
        //TODO
        return 0;
    }

    private int requirements(String password) {
        //TODO
        return 0;
    }
}
