package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.dto.SetmealDto;
import com.frx01.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/5/8  22:58
 */
public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时需要保存套餐和菜品的关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品关联的数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);


    /**
     * 回显套餐数据：根据套餐id查询套餐
     * @return
    */
    SetmealDto getDate(Long id);
}
