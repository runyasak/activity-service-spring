package com.example.activityservice.service;

import com.example.activityservice.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {

    public List<Activity> getAll() {
        Activity activity1 = Activity.builder()
                .id(1)
                .name("Login")
                .description("World is logged in")
                .build();

        Activity activity2 = Activity.builder()
                .id(2)
                .name("Logout")
                .description("World is logged out")
                .build();

        List<Activity> activityList = new ArrayList<>();
        activityList.add(activity1);
        activityList.add(activity2);

        return activityList;
    }
}
