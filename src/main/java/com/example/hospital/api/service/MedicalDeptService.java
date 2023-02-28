package com.example.hospital.api.service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author WENJIN LI
 * @date 2023/2/26 14:41
 */
public interface MedicalDeptService {
    public ArrayList<HashMap> searchAll();
    public HashMap searchDeptAndSub();

}

