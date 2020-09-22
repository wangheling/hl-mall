package com.heling.service.impl;

import com.heling.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/22 16:30
 */
@Component
public class OrderFallBackService implements OrderService {
    @Override
    public String test(String userId) {
        return "创建订单失败！";
    }
}
