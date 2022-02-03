package com.example.sping_portfolio.controllers.navodit.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("navodit/frq9")
    public String book(Model model){

        return "navodit/frq9";
    }
}
