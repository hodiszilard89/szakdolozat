package com.example.hirportal01.service.impl;

import com.example.hirportal01.dto.NewsDTO;
import com.example.hirportal01.entity.News;
import com.example.hirportal01.repository.NewsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * átadódik az adat a adatbázis reétegből a service rétegbe
 */

@Service
public class NewsService implements com.example.hirportal01.service.NewsService {

    private final ModelMapper modelMapper;

    private final NewsRepository newsRepository;

    public NewsService(ModelMapper modelMapper, NewsRepository newsRepository) {
        this.modelMapper = modelMapper;
        this.newsRepository = newsRepository;
    }

    @Override
    public List<NewsDTO> findAll() {
        List<News> newsList = newsRepository.findAll();

        return newsList.stream()
                .map(anNew -> modelMapper.map(anNew,NewsDTO.class))
                .collect(Collectors.toList());  //listába gyűjti a feldolgozott (átmappelt) elemeket

    }
}
