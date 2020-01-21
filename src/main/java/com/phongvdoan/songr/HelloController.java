package com.phongvdoan.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String captializeString(@PathVariable String word, Model m) {
        String wordsInAllCaps = word.toUpperCase();
        m.addAttribute("capitalizedWord", wordsInAllCaps);
        return "capitalize";
    }

    @GetMapping("/albums")
    public String displayAlbums(Model m) {
       Album[] albumList = new Album[]{new Album("ABC","Jackson 5", 11, 1000, "http://mjlyricsonly.com/wp-content/uploads/2011/11/ABC-album-cover.jpg"), new Album("Arrival", "ABBA", 12, 999, "https://media.pitchfork.com/photos/5929bf51abf31b7dc71562bd/1:1/w_320/aaa1a875.jpg"), new Album("BAD", "Michael Jackson", 12, 2000, "https://www.rollingstone.com/wp-content/uploads/2018/06/rs-144691-449419e5c92e0ca199f3ca3d8a3be6acb31ec21e.jpg")};
        m.addAttribute("albums", albumList);
        return "albums";
    }
}
