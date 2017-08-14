package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dhruvkalaria on 8/13/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }
}
