package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 添加员工时所传的数据模型
 */
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
