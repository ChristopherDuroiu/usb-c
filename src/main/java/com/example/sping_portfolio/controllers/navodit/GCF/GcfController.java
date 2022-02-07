package com.example.sping_portfolio.controllers.navodit.GCF;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GcfController {
    @GetMapping("navodit/frq10")
    public String gcf(
            @RequestParam(name = "first", required = false, defaultValue = "0") int first,
            @RequestParam(name = "second", required = false, defaultValue = "0") int second,
            Model model){

        int gcf = NumberSystem.Gcf(first,second);
        model.addAttribute("gcf", gcf);

        return "navodit/frq10";
    }
}
