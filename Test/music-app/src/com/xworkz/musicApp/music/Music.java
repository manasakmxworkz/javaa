package com.xworkz.musicApp.music;

import com.xworkz.musicApp.songDetails.Songs;

public class Music extends Songs {
    public Songs song;
    public int availableStorage;

    public boolean allowDownload(Songs song){
        boolean isSongDownloaded=false;
        if(availableStorage>=50){
            System.out.println("Sufficient Storage is there.. You can download the song");

            if(song!=null){
                this.song=song;
                this.song.songDetails();
                isSongDownloaded=true;
                System.out.println("Song is being downloaded");
            }else System.out.println("Song not found");

        }else System.out.println("Please free up the space");
        return isSongDownloaded;
    }

}
