package io.github.matheusfm.passwordmeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordFrontController {
    @GetMapping("/password")
    public String view() {
        return "password";
    }
}
