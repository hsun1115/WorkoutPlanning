package com.hsun.WorkoutPlanning.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsun.WorkoutPlanning.pojo.Action;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ActionDao extends BaseMapper<Action> {
}
