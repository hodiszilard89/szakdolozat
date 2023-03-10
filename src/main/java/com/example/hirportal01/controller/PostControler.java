package com.example.hirportal01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class PostControler {

    @RequestMapping(path="/posts", method = RequestMethod.GET)
    public List<String> findll(){
        return List.of(
                "StarWars", "Terminator"
        );
    }
}
