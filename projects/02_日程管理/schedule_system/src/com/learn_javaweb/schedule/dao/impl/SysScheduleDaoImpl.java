package com.learn_javaweb.schedule.dao.impl;

import com.learn_javaweb.schedule.dao.BaseDao;
import com.learn_javaweb.schedule.dao.SysScheduleDao;
import com.learn_javaweb.schedule.pojo.SysSchedule;

import java.util.List;

public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql = "insert into sys_schedule values(DEFAULT,?,?,?)";
        return baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql = "select sid,uid,title,completed from sys_schedule";
        return baseQuery(SysSchedule.class, sql);
    }

}
