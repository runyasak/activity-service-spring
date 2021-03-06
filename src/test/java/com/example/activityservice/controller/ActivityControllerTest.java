package com.example.activityservice.controller;

import com.example.activityservice.model.Activity;
import com.example.activityservice.service.ActivityService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ActivityControllerTest {

    @Mock
    private ActivityService activityService;

    @InjectMocks
    private ActivityController activityController;

//    @Test
//    void getActivity() {
//    }
    @Test
    void getActivities() {
        Activity activity1 = new Activity();
        activity1.setName("Login");

        Activity activity2 = new Activity();
        activity2.setName("Logout");

        List<Activity> activities = List.of(activity1, activity2);
        Mockito.when(activityService.getAll()).thenReturn(activities);

        List<Activity> activityList = activityController.getActivities();

        Assertions.assertEquals(2, activityList.size());
        Assertions.assertEquals("Login", activityList.get(0).getName());
    }
}