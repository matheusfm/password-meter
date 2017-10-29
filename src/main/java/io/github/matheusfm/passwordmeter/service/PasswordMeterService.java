package io.github.matheusfm.passwordmeter.service;

import io.github.matheusfm.passwordmeter.metric.model.PasswordStrength;
import io.github.matheusfm.passwordmeter.metric.PasswordMeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordMeterService {
    @Autowired
    private PasswordMeter passwordMeter;

    public PasswordStrength measureStrength(String password) {
        return passwordMeter.measure(password);
    }
}
