package com.example.activityservice.service;

import com.example.activityservice.model.Activity;
import com.example.activityservice.repository.ActivityRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

class ActivityServiceTest {

    @Mock
    ActivityRepository activityRepository;

    @InjectMocks
    ActivityService activityService;

    @Test
    void getAllTest() {
        Activity activity1 = new Activity();
        activity1.setName("Logout");
        activity1.setDescription("World is logged out");

        Activity activity2 = new Activity();

        List<Activity> activities = List.of(activity1, activity2);

        Mockito.when(activityRepository.findAll()).thenReturn(activities);

        List<Activity> actual = activityService.getAll();

        Assertions.assertEquals(2, actual.size());
        Assertions.assertEquals("Login", actual.get(0).getName());
        Assertions.assertEquals("World is logged in", actual.get(0).getDescription());
    }
}