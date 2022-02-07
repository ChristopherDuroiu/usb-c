package com.example.sping_portfolio.controllers.navodit.GCF;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GcfController {
    @GetMapping("navodit/frq10")
    public String gcf(Model model){

        return "navodit/frq10";
    }
}
