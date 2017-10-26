package io.github.matheusfm.passwordmeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordController {
    @GetMapping
    public String getPasswordView() {
        return "password";
    }
}
