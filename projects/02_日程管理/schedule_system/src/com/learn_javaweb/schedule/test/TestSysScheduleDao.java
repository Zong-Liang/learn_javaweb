package com.learn_javaweb.schedule.test;

import com.learn_javaweb.schedule.dao.SysScheduleDao;
import com.learn_javaweb.schedule.dao.impl.SysScheduleDaoImpl;
import com.learn_javaweb.schedule.pojo.SysSchedule;
import org.junit.jupiter.api.Test;

public class TestSysScheduleDao {
    private final SysScheduleDao scheduleDao = new SysScheduleDaoImpl();

    @Test
    public void testAddSchedule() {
        System.out.println(scheduleDao.addSchedule(new SysSchedule(null, 2, "学习MySQL", 0)));
    }

    @Test
    public void testFindAll() {
        scheduleDao.findAll().forEach(System.out::println);
    }
}
