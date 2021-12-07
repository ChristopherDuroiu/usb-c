package com.example.sping_portfolio.controllers.caleb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class LightSequenceCaleb {
    private String seq = "";
    public LightSequenceCaleb(String seq) {
        this.seq = seq;
    }

    public void changeSequence(String seq) {this.seq = seq; }

    public void display() {

    }
}
