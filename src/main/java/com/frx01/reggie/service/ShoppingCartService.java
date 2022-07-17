package com.frx01.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.frx01.reggie.entity.ShoppingCart;

/**
 * @author frx
 * @version 1.0
 * @date 2022/6/5  16:48
 */
public interface ShoppingCartService extends IService<ShoppingCart> {
    void clean();
}
