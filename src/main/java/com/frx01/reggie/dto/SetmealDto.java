package com.frx01.reggie.dto;

import com.frx01.reggie.entity.Setmeal;
import com.frx01.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
