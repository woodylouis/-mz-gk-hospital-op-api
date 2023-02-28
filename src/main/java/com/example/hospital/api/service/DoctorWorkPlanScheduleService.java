package com.example.hospital.api.service;

import com.example.hospital.api.db.pojo.DoctorWorkPlanScheduleEntity;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author WENJIN LI
 * @date 2023/2/28 15:10
 */
public interface DoctorWorkPlanScheduleService {
    public void insert(ArrayList<DoctorWorkPlanScheduleEntity> list);
    public ArrayList searchDeptSubSchedule(Map param);

}

