package io.github.matheusfm.passwordmeter.controller;

import io.github.matheusfm.passwordmeter.model.PasswordStrength;
import io.github.matheusfm.passwordmeter.service.PasswordMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
    @Autowired
    private PasswordMeterService service;

    @PostMapping("/password")
    public PasswordStrength measurePassword(@RequestBody String password) {
        return service.measureStrength(password);
    }

}
