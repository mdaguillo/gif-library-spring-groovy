package com.mikedaguillo.giflibrary.data

import com.mikedaguillo.giflibrary.model.Gif
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component

// The Spring Data MongoDB creates the implementation of this interface on the fly, and creates the mongo queries for us.
// Might want to refactor this so I do the queries to learn them
@Component
interface GifRepository extends MongoRepository<Gif, String> {
    def Gif findByName(String name);
}
