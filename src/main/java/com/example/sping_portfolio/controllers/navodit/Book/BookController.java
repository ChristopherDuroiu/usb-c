package com.example.sping_portfolio.controllers.navodit.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @GetMapping("navodit/frq9")
    public String book(
            @RequestParam(name = "book", defaultValue = "") String book,
            @RequestParam(name = "author", defaultValue = "") String author,
            @RequestParam(name = "ill", required = false, defaultValue = "") String ill,
            Model model){



        return "navodit/frq9";
    }
}
