package com.frx01.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.frx01.reggie.entity.Employee;
import com.frx01.reggie.mapper.EmployeeMapper;
import com.frx01.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author frx
 * @version 1.0
 * @date 2022/4/27  21:30
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
