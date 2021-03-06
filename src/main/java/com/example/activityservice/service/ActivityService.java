package com.example.activityservice.service;

import com.example.activityservice.model.Activity;
import com.example.activityservice.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getAll() {
        return activityRepository.findAll();
    }

    public List<Activity> getByUser(String username) {
        return activityRepository.findActivityFromUser(username);
    }
}
