package com.example.song.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.song.model.Song;
import com.example.song.service.SongH2Service;
import java.util.*;


@RestController
public class SongController{
    @Autowired
    public SongH2Service service;
    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
        return service.getSongs();
    }
    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
        return service.getSongById(songId);
    }
    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
        return service.addSong(song);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId,@RequestBody Song song){
        return service.updateSong(songId, song);
    }
    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
         service.deleteSong(songId);
    }
    
}