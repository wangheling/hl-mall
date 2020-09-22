package com.heling.service.impl;

import com.heling.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/22 15:54
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String test(String userId) {

        long start = System.currentTimeMillis();
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("耗时{}ms", System.currentTimeMillis() - start);
        return "用户" + userId + "创建订单成功";
    }
}
