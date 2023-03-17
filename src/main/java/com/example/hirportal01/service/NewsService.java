package com.example.hirportal01.service;

import com.example.hirportal01.dto.NewsDTO;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    Optional<NewsDTO> findByID(Long id);
    List<NewsDTO>  findAll();
    void delete(Long id);
    NewsDTO update(NewsDTO newsDTO);
    NewsDTO save(NewsDTO newsDTO);
}
