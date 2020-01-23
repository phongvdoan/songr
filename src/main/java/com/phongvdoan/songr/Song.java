package com.phongvdoan.songr;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    int trackNumber;
    String title;
    long length;

    public Song(String title, long length, int trackNumber){
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Song(){

    }

    public String toString(){
        return String.format("Track Number: %d, Title: %s, Length: %d", this.trackNumber, this.title, this.length);
    }

}
