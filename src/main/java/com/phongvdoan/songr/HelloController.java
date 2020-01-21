package com.phongvdoan.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String captializeString(@PathVariable String word, Model m) {
        String wordsInAllCaps = word.toUpperCase();
        System.out.println(wordsInAllCaps);
        m.addAttribute("capitalizedWord", wordsInAllCaps);
        return "capitalize";
    }
}
