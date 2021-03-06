package io.github.matheusfm.passwordmeter.controller;

import io.github.matheusfm.passwordmeter.metric.model.PasswordStrength;
import io.github.matheusfm.passwordmeter.service.PasswordMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class PasswordController {
    @Autowired
    private PasswordMeterService service;

    @PostMapping("/password")
    public PasswordStrength measurePassword(@RequestBody Map<String, String> body) {
        return service.measureStrength(body.get("password"));
    }

}
