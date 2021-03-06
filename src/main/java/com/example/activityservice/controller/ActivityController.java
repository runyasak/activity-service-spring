package com.example.activityservice.controller;

import com.example.activityservice.model.Activity;
import com.example.activityservice.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping(value = "/activity")
    public Activity getActivity() {

        return Activity.builder()
                .id(1)
                .name("Login")
                .description("World is logged in")
                .build();
    }

    @GetMapping(value = "/activities")
    public List<Activity> getActivities() {
        return activityService.getAll();
    }
}
