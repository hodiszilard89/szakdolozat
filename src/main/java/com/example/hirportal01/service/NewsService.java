package com.example.hirportal01.service;
import com.example.hirportal01.dto.NewsDTO;


import java.util.List;

public interface NewsService {
    List<NewsDTO> findAll();
    NewsDTO create(NewsDTO newsDTO);
}
