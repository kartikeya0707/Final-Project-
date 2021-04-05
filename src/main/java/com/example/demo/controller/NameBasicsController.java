package com.example.demo.controller;

import com.example.demo.service.NameBasicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameBasicsController {

    @Autowired
    private NameBasicsService nameBasicsService;
    @GetMapping
    public ResponseEntity<?> getNameDetails(){
        return new ResponseEntity<>(nameBasicsService.getNameDetails(), HttpStatus.OK);
    }

}
