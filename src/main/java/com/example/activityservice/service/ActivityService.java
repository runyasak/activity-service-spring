package com.example.activityservice.service;

import com.example.activityservice.model.Activity;
import com.example.activityservice.repository.ActivityRepository;
import org.springframework.data.domain.Example;
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
        Activity activity = Activity.builder().createdBy(username).build();

        // 3: Example
        // Example<Activity> example = Example.of(activity);
        // return activityRepository.findAll(example);
        
        return activityRepository.findAllByCreatedBy(username);
    }
}
