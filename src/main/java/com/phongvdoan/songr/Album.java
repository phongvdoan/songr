package com.phongvdoan.songr;

public class Album {
    String title;
    String artist;
    int songCount;
    int lengthInSeconds;
    String imageUrl;

    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
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

    public int getLengthInSeconds(){
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

}
