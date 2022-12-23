package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;


    }

    public boolean addToPlayList(String songName, LinkedList<Song> songs) {
        Song song = this.songs.findSong(songName);
        if (song != null) {
            songs.add(song);
        }
        return song != null;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
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

        public Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }


    }
}
