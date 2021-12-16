package com.example.sping_portfolio.controllers.navodit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LightSequenceController {
    @GetMapping("navodit/frq1")
    public String frq1(Model model){
        LightSequence f = new LightSequence("0011");
        String seq1 = f.insertSegment("11",2);
        String updated = f.updateSequence("1100");
        model.addAttribute("f",f);
        model.addAttribute("seq1", seq1);
        model.addAttribute("updated", updated);

        return "navodit/frq1";
    }

}
