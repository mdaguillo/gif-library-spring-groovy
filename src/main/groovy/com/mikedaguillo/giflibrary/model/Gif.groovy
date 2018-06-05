package com.mikedaguillo.giflibrary.model

import java.time.LocalDate
import org.springframework.data.annotation.Id

class Gif {
    // Public fields
    @Id
    String id;

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
