package com.hsun.WorkoutPlanning.service.action;

import com.hsun.WorkoutPlanning.pojo.Action;

import java.util.List;
import java.util.Map;

public interface ActionService {
    //int count();

    public void insert(Action action);

    //void update(Action action);

    //to do delete by name

    public List<String> findAll();

    List<String> findByCategoryId(int id);
}
