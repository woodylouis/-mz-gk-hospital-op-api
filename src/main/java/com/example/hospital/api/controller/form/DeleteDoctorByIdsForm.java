package com.example.hospital.api.controller.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author WENJIN LI
 * @date 2023/2/26 21:42
 */
@Data
public class DeleteDoctorByIdsForm {
    @NotEmpty(message = "ids不能为空")
    private Integer[] ids;
}
