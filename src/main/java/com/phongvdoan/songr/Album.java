package com.phongvdoan.songr;



import javax.persistence.*;
import java.util.List;


@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToMany(mappedBy = "album")
    public List<Song> songs;

    String title;
    String artist;
    int songCount;
    long lengthInSeconds;
    String imageUrl;

    public Album(String title, String artist, int songCount, long lengthInSeconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
    }

    public Album(){

    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }

    public int getSongCount(){
        return this.songCount;
    }

    public long getLengthInSeconds(){
        return this.lengthInSeconds;
    }

    public void setTitle(String title){
        this.title= title;
    }

    public void setArtist(String artist){
        this.artist= artist;
    }

    public void setSongCount(int songCount){
        this.songCount= songCount;
    }

    public void setLengthInSeconds(int lengthInSeconds){
        this.lengthInSeconds= lengthInSeconds;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl= imageUrl;
    }

    public long getId() {
        return id;
    }
}
