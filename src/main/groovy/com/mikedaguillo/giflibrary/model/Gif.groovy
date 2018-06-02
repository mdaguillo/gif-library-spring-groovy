package com.mikedaguillo.giflibrary.model

import java.time.LocalDate

class Gif {
    // Public fields
    String name;
    LocalDate dateUploaded;
    String username;
    boolean favorite;

    Gif(String name, LocalDate dateUploaded, String username, boolean favorite)
    {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }


}
