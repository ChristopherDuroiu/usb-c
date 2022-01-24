package com.example.sping_portfolio.controllers.navodit.Pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassController {
    @GetMapping("navodit/frq5")
    public String frq5(){
        return "navodit/frq5";
    }
}
