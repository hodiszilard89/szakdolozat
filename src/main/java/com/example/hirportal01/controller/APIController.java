//package com.example.hirportal01.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/")
//public class APIController {
//
//
//@Autowired
//    NewRepository newRepository;
//
//    public NewRepository getNewRepository() {
//        return newRepository;
//    }
//
//    @GetMapping(path = "/getusernames")
//    public List<Writer> getAllNew() {
//        List<Writer> news = newRepository.findAll();
//        Writer writer = new Writer();
//        writer.setChatName("writer poroba");
//        writer.setFirstName("Proba2");
//        writer.setSecName("secNAme");
//        news.add(writer);
//        return news;
//    }
//}
