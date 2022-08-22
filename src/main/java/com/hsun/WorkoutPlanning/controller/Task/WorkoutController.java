package com.hsun.WorkoutPlanning.controller.Task;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/select/")
public class WorkoutController {

    @RequestMapping("category/")
    public Map<String, List<String>> getWorkoutList() {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("Jump Rope");
        list1.add("Burpee");

        map.put("Cardio", list1);

        return map;
    }
}
