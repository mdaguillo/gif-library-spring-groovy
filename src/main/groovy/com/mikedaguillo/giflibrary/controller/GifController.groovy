package com.mikedaguillo.giflibrary.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class GifController {
    @RequestMapping(value = "/")
    def listGifs() {
        return "home"; // Understand to look for a template with the name home
    }

    @RequestMapping("/test")
    @ResponseBody
    def testResponse() {
        return "This is a test message. Hello World!";
    }
}
