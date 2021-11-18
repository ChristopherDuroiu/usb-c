package com.example.sping_portfolio.controllers.grace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Grace {
    @GetMapping("/grace")
    public String grace() {return "grace";}
}
