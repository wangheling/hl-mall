package com.heling.controller;

import com.heling.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/22 16:09
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/{userId}")
    public String testOrder(@PathVariable String userId) {
        return orderService.test(userId);
    }

}
