package com.heling.domain;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Desc：组合商品
 * @Author: heling
 * @Date: 2020/9/27 13:26
 */
@Data
public class CombineItem extends Item {

    private List<Item> childItems;


    @Override
    public boolean hasStock() {
        if (CollectionUtils.isEmpty(childItems)) return false;
        for (Item childItem : childItems) {
            if (!childItem.hasStock()) {
                return false;
            }
        }
        return true;
    }
}
