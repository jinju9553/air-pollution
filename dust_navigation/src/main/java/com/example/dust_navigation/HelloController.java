package com.example.dust_navigation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/home")
    public String getHome(){
        return "Raspberry Cookies!!";
    }
}
