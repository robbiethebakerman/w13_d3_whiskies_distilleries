package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> getAllWhiskiesByYear(int year);

//    List<Whisky> getAllWhiskiesByRegion(String region);
}
