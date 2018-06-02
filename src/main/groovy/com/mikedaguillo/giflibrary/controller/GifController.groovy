package com.mikedaguillo.giflibrary.controller

import com.mikedaguillo.giflibrary.model.Gif
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

import java.time.LocalDate

@Controller
class GifController {
    @RequestMapping(value = "/")
    def listGifs() {
        return "home"; // Understand to look for a template with the name home
    }

    @RequestMapping("/gif")
    def gifDetails(ModelMap modelMap)
    {
        def Gif gif = new Gif("compiler-bot", LocalDate.of(2018,6,2), "mdaguillo", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
