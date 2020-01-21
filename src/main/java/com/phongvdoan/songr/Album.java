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

    public String getArtist(){
        return this.artist;
    }

    public String getImageUrl(){
        return this.imageUrl;
    }
}
