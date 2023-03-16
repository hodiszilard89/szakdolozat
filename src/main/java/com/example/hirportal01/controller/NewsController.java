package com.example.hirportal01.controller;

import com.example.hirportal01.dto.NewsDTO;


import com.example.hirportal01.service.impl.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping(path = "/news",method = RequestMethod.GET)
    public ResponseEntity<List<NewsDTO>> findAll() {
        List<NewsDTO> news = newsService.findAll();
        return ResponseEntity.ok().body(news);
    }

    @RequestMapping(path = "/news",method = RequestMethod.POST)
    public ResponseEntity<NewsDTO> create(@RequestBody NewsDTO  newsDTO) {

        return ResponseEntity.ok().body(newsService.create(newsDTO));
    }
}
