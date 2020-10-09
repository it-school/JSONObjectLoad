package com.itschool;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        Artists artists = new Artists();
        artists = artists.loadByURL("https://itunes.apple.com/lookup?amgArtistId=468749,5723");
        System.out.println(artists);
    }
}
