package com.heling.service;

import com.heling.service.impl.OrderFallBackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/22 16:19
 */
@FeignClient(serviceId = "order-service",fallback = OrderFallBackService.class)
public interface OrderService {

    @GetMapping("order/order/{userId}")
    String test(@PathVariable("userId") String userId);

}
