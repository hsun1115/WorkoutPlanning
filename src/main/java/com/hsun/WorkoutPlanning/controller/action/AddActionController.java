package com.hsun.WorkoutPlanning.controller.action;

import com.hsun.WorkoutPlanning.pojo.Action;
import com.hsun.WorkoutPlanning.service.action.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddActionController {
    @Autowired
    private ActionService actionService;

    @PostMapping("/workout/action/insert/")
    public void insert(@RequestBody Action action) {
        actionService.insert(action);
    }
}
