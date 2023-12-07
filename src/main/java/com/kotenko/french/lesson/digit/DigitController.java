package com.kotenko.french.lesson.digit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class DigitController {
    @GetMapping("api/dictation")
    public String showNumber(Model model) {
        var random = new Random().nextInt(11);
        model.addAttribute("number", random);
        return "number";
    }
}
