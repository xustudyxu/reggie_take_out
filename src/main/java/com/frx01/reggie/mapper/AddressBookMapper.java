package com.frx01.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.frx01.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/1  21:05
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}
