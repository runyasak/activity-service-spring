package com.example.activityservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class Activity {
    private Integer id;
    private String name;
    private String description;
}
