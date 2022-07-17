package com.frx01.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frx01.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/30  15:10
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
