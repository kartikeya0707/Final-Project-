package com.example.demo.service;

import com.example.demo.model.NameBasics;
import com.example.demo.repository.NameBasicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameBasicsService {
    @Autowired
    private NameBasicsRepository nameBasicsRepository;

    public List<NameBasics> getNameDetails () {
        return nameBasicsRepository.findAll();

    }
}
