package com.example.activityservice.service;

import com.example.activityservice.model.Activity;
import com.example.activityservice.repository.ActivityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ActivityServiceTest {

    @Test
    void getAllTest() {
        ActivityRepository activityRepository;
        ActivityService activityService = new ActivityService(activityRepository);
        List<Activity> actual = activityService.getAll();

        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals("Login", actual.get(0).getName());
        Assertions.assertEquals("World is logged in", actual.get(0).getDescription());
    }
}