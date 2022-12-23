package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song song = findSong(title);
        if(song == null)
        this.songs.add(new Song(title, duration));
        return song == null;
    }

    private Song findSong(String title) {
        for (Song song:
             songs) {
            if(song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> songs) {
        int index = trackNumber -1;
        if (index < 0 || index > songs.size()) {
            return false;
        }
        Song song = this.songs.get(index);
        return songs.add(song);

    }

    public boolean addToPlayList(String songName, LinkedList<Song> songs) {
        Song song = findSong(songName);
        if (song != null) {
            songs.add(song);
        }
        return song != null;
    }
}
