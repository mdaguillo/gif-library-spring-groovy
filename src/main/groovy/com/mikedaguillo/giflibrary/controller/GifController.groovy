package com.mikedaguillo.giflibrary.controller

import com.mikedaguillo.giflibrary.data.GifRepository
import com.mikedaguillo.giflibrary.model.Gif
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

import java.time.LocalDate

@Controller
class GifController {
    @Autowired
    def private GifRepository _gifRepository

    @RequestMapping(value = "/")
    def listGifs() {
        return "home"; // Understand to look for a template with the name home
    }

    @RequestMapping("/gif")
    def gifDetails(ModelMap modelMap)
    {
        def Gif gif = _gifRepository.findByName("android-explosion");
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
