package com.example.hospital.api.controller;

import cn.dev33.satoken.annotation.SaCheckLogin;
import com.example.hospital.api.common.R;
import com.example.hospital.api.service.MedicalDeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author WENJIN LI
 * @date 2023/2/26 14:42
 */
@RestController
@RequestMapping("/medical/dept")
public class MedicalDeptController {
    @Resource
    private MedicalDeptService medicalDeptService;

    @GetMapping("/searchAll")
    @SaCheckLogin
    public R searchAll() {
        ArrayList<HashMap> list = medicalDeptService.searchAll();
        return R.ok().put("result", list);
    }

    @GetMapping("/searchDeptAndSub")
    @SaCheckLogin
    public R searchDeptAndSub() {
        HashMap map = medicalDeptService.searchDeptAndSub();
        return R.ok().put("result", map);
    }
}

