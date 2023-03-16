package com.example.hirportal01.controller;

import com.example.hirportal01.dto.LawDTO;
import com.example.hirportal01.service.LawService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/law")
public class LawController {
    private final LawService lawService;

    public LawController(LawService lawService) {
        this.lawService = lawService;
    }



    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<LawDTO> create(@RequestBody LawDTO lawDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body( lawService.create(lawDTO));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<LawDTO>>findAll(){
        return ResponseEntity.ok(lawService.findAll());
    }

}
