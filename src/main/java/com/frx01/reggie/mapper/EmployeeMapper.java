package com.frx01.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frx01.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author frx
 * @version 1.0
 * @date 2022/4/27  21:27
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
