package io.github.matheusfm.passwordmeter.controller;

import io.github.matheusfm.passwordmeter.model.PasswordStrength;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PasswordController {
    @GetMapping("/")
    public String getPasswordView(Map<String, Object> model) {
        model.put("strength", new PasswordStrength("0%", "Muito curta"));
        return "password";
    }
}
