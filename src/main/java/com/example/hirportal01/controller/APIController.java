package com.example.hirportal01.controller;

import com.example.hirportal01.entity.News;


import com.example.hirportal01.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class APIController {


    @Autowired
    NewsRepository newsRepository;

    public NewsRepository getNewsRepository() {
        return newsRepository;
    }

    @GetMapping(path = "/getusernames")
    public List<News> getAllNew() {
        List<News> news = newsRepository.findAll();
        return news;
    }
}
