package com.hsun.WorkoutPlanning.service.impl.action;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hsun.WorkoutPlanning.dao.ActionDao;
import com.hsun.WorkoutPlanning.pojo.Action;
import com.hsun.WorkoutPlanning.service.action.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ActionServiceImpl implements ActionService {
    @Autowired
    private ActionDao actionDao;
//    @Override
//    public int count() {
//        return 0;
//    }

    @Override
    public void insert(Action action) {
        Action action1 = new Action(action.getName(), action.getCategory_id());
        actionDao.insert(action1);
    }

//    @Override
//    public void update(Action action) {
//        return;
//    }
//
    @Override
    public List<String> findAll() {
        QueryWrapper<Action> queryWrapper = new QueryWrapper<>();
        List<String> list = new ArrayList<>();
        List<Object> actions = actionDao.selectObjs(queryWrapper);
        for (Object obj : actions) {
            list.add(String.valueOf(obj));
        }
//        System.out.println(list);
        return list;
    }
//
//    @Override
//    public List<Action> findByCategoryId(int id) {
//        return null;
//    }
}
