package com.example.hospital.api.service;

import cn.hutool.json.JSONArray;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author WENJIN LI
 * @date 2023/2/28 14:12
 */
public interface MedicalDeptSubWorkPlanService {
    public JSONArray searchWorkPlanInRange(Map param, ArrayList dateList);
}

