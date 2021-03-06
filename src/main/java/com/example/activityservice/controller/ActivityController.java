package com.example.activityservice.controller;

import com.example.activityservice.model.Activity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @GetMapping(value = "/activity")
    public Activity getActivity() {

        return Activity.builder()
                .id(1)
                .name("Login")
                .description("World is logged in")
                .build();
    }
}
