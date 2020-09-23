package com.heling.controller;

import com.heling.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/22 16:14
 */
@RestController
public class UserController {

    @Resource
    private OrderService orderService;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public String test(@PathVariable("userId") String userId) {
        return orderService.test(userId);
    }

    @GetMapping("/ribbon/{userId}")
    public String testRibbon(@PathVariable("userId") String userId) {
        return restTemplate.getForObject("http://order-service" + "/order/order/{1}", String.class, userId);
    }

}
