package com.example.sping_portfolio.controllers.navodit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RsvpController {
    @GetMapping("navodit/frq2")
    public String rsvp(Model model){
       Rsvp r = new Rsvp(true,1);
       String dinner = r.dinner();
       model.addAttribute("r",r);
       model.addAttribute("dinner", dinner);

       return "navodit/frq2";
    }
}
