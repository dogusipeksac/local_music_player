package com.example.music_player;


public class SongInfo {
    public String path;
    public String song_name;
    public  String album_name;
    public String artist_name;


    public SongInfo(String path, String song_name, String album_name, String artist_name) {
        this.path = path;
        this.song_name = song_name;
        this.album_name = album_name;
        this.artist_name = artist_name;

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }


}