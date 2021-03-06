package com.example.activityservice.controller;

import com.example.activityservice.model.Activity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @GetMapping(value = "/activity")
    public Activity getActivity() {
        Activity activity = new Activity();
        activity.setId(1);
        activity.setName("Login");
        activity.setDescription("World is logged in");

        return activity;
    }
}
