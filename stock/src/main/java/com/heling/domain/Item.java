package com.heling.domain;

import lombok.Data;

import java.util.Random;

/**
 * @Desc：商品
 * @Author: heling
 * @Date: 2020/9/27 13:23
 */
@Data
public class Item {

    /**
     * 是否有库存
     * @desc:
     * @param:
     * @return:
     * @author: heling
     */
    public boolean hasStock() {
        //模拟查询库存
        return new Random().nextBoolean();
    }

}
