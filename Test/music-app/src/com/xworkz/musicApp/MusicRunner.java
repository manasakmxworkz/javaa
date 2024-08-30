package com.xworkz.musicApp;

import com.xworkz.musicApp.music.Music;
import com.xworkz.musicApp.songDetails.Songs;

public class MusicRunner {

    public static void main(String[] args){
        Music music=new Music();
        music.availableStorage=100;

        Songs song=new Songs();
        song.title="Ninnindale";
        song.album="Milana";
        song.artist="Punneth Rajkumar";
        song.duration="280 seconds";
        song.language="Kannada";

        music.allowDownload(song);
    }
}
