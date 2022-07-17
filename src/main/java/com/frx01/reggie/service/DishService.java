package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.dto.DishDto;
import com.frx01.reggie.entity.Dish;
import org.hamcrest.core.Is;

import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/8  22:57
 */
public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish，dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);


    //根据传过来的id批量或者是单个的删除菜品
    void deleteByIds(List<Long> ids);
}
