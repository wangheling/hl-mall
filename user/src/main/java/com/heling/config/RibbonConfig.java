package com.heling.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/23 11:23
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 配置负载均衡策略
     *
     * @desc:
     * @param:
     * @return:
     * @author: heling
     */
//    @Bean
//    public IRule ribbonRule() {
//        return new RandomRule();
////        return new RoundRobinRule();
//    }

}
