package com.heling;

import com.heling.domain.CombineItem;
import com.heling.domain.Item;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/27 13:30
 */
public class Test {
    public static void main(String[] args) {
        Item item = new Item();
        Item item2 = new Item();
        List<Item> items = Arrays.asList(item, item2);
        Item combineItem = new CombineItem();
        ((CombineItem) combineItem).setChildItems(items);
        System.out.println(combineItem.hasStock());
    }
}
