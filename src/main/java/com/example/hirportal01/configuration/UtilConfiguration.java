package com.example.hirportal01.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Entity;

@Configuration
public class UtilConfiguration {
    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
