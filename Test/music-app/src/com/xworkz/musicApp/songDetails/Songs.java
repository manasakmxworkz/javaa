//Example For Inheritance

package com.xworkz.musicApp.songDetails;

public class Songs {
    public String title;
    public String artist;
    public String duration;
    public String album;
    public String language;

    public void songDetails(){
        System.out.println("Title of the Song:" +this.title);
        System.out.println("Name of the Artist:" +this.artist);
        System.out.println("Duration of the Song:" +this.duration);
        System.out.println("Name of the Album:" +this.album);
        System.out.println("Language of the Song:" +this.language);
    }
}
