package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dhruvkalaria on 8/13/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das-Boot";
    }
}
