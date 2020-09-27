package com.heling.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/9/27 16:00
 */
@Component
@Slf4j
public class TestConsumer {

    @KafkaListener(topics = {"testTopic"})
    public void onMessage(String message) {
        log.info("receive kafka message:" + message);
    }
}
