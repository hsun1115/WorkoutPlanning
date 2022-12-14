package com.hsun.WorkoutPlanning.controller.action;

import com.hsun.WorkoutPlanning.service.action.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ActionRenderController {
    @Autowired
    private ActionService actionService;

//    @GetMapping("/workout/action/findAll/")
//    public String findAll(Model m) {
//        List<String> list = actionService.findAll();
//        System.out.println(list);
//        m.addAttribute("lists", list);
//        m.addAttribute("cardios", list);
//        return "index";
//    }

    @GetMapping("/workout/action/group/")
    public String groupActions(Model m) {
        List<String> strength = actionService.findByCategoryId(2);
        List<String> cardio = actionService.findByCategoryId(3);
        m.addAttribute("lists", strength);
        m.addAttribute("cardios", cardio);
        return "index";
    }
}
