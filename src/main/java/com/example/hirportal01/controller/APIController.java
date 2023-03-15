package com.example.hirportal01.controller;

import com.example.hirportal01.dto.NewsDTO;


import com.example.hirportal01.service.impl.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/path")
public class APIController {

    private final NewsService newsService;

    public APIController(NewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<NewsDTO>> findAll() {
        List<NewsDTO> news = newsService.findAll();
        return ResponseEntity.ok().body(news);
    }
}
