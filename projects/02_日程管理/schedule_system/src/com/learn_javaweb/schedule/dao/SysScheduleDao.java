package com.learn_javaweb.schedule.dao;

import com.learn_javaweb.schedule.pojo.SysSchedule;

import java.util.List;

public interface SysScheduleDao {
    int addSchedule(SysSchedule schedule);

    List<SysSchedule> findAll();
}
