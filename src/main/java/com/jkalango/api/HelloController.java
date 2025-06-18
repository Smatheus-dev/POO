package com.jkalango.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")

public class HelloController {
     
    // HTTP- GET, POST, DELETE
    // método java- foco HTTP-REST-RESTFULL
    @GetMapping
    public String mostrarMensagem(){
        return "Hello  Spring!";
    }

    
}





    

