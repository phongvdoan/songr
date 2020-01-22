package com.phongvdoan.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class HomeController {

    @Autowired
    AlbumRepository albumRepository;

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
//       Album[] albumList = new Album[]{new Album("ABC","Jackson 5", 11, 1000, "http://mjlyricsonly.com/wp-content/uploads/2011/11/ABC-album-cover.jpg"), new Album("Arrival", "ABBA", 12, 999, "https://media.pitchfork.com/photos/5929bf51abf31b7dc71562bd/1:1/w_320/aaa1a875.jpg"), new Album("BAD", "Michael Jackson", 12, 2000, "https://www.rollingstone.com/wp-content/uploads/2018/06/rs-144691-449419e5c92e0ca199f3ca3d8a3be6acb31ec21e.jpg")};
       List<Album> albumList = albumRepository.findAll();
       m.addAttribute("albums", albumList);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView postAlbums(String title, String artist, Integer songCount, Integer lengthInSeconds, String imageUrl){
        Album newAlbum = new Album(title, artist, songCount, lengthInSeconds, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

    @DeleteMapping("/albums")
    public RedirectView deleteAlbums(Long id){
        System.out.println("id = " + id);
        albumRepository.deleteById(id);
        return new RedirectView("/albums");
    }

    @PutMapping("/albums")
    public RedirectView updateAlbums(Long id){
        Album album= albumRepository.getOne(id);
        album.setArtist("BBBBAAAAMMMM");
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

}
