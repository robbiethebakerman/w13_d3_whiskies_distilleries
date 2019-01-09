package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/byYear/{year}")
    public List<Whisky> getWhiskiesByYear(@PathVariable int year) {
        return whiskyRepository.getAllWhiskiesByYear(year);
    }

//    @GetMapping(value = "/byRegion/{region}")
//    public List<Whisky> getWhiskiesByRegion(@PathVariable String region) {
//        return whiskyRepository.getAllWhiskiesByRegion(region);
//    }

}
