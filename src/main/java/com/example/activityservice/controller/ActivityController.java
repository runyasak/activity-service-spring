package com.example.activityservice.controller;

import com.example.activityservice.model.Activity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public Activity getActivity() {
        Activity activity = new Activity();
        activity.setId(1);
        activity.setName("Login");
        activity.setDescription("World is logged in");

        return activity;
    }
}
