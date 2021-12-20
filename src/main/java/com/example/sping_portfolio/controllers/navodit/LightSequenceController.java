package com.example.sping_portfolio.controllers.navodit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LightSequenceController {
    @GetMapping("navodit/frq1")
    public String frq1(@RequestParam(name = "sequence", required = false, defaultValue = "0") String seq,
            @RequestParam(name = "insert", required = false, defaultValue = "0") String insert,
            @RequestParam(name = "index", required = false, defaultValue = "0") int index,
            @RequestParam(name = "update", required = false, defaultValue = "0") String update,
            @RequestParam(name = "delete", required = false, defaultValue = "0") String a,
            Model model){
        LightSequence f = new LightSequence(seq);
        String seq1 = f.insertSegment(insert,index);
        String updated = f.updateSequence(update);
        String deleted = f.deleteSequence(a);
        model.addAttribute("f",f);
        model.addAttribute("seq1", seq1);
        model.addAttribute("updated", updated);
        model.addAttribute("deleted", deleted);

        return "navodit/frq1";
    }

}
