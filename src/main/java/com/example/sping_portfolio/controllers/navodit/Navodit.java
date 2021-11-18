package com.example.sping_portfolio.controllers.navodit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Navodit {
    @GetMapping("/navodit")
    public String navodit() {
        return "navodit";
    }
}
