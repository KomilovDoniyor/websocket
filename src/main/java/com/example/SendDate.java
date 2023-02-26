/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:1/5/2023
 * Time:5:48 PM
 * Project Name:websocket
 */
package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class SendDate {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedDelay = 5000L)
    public void getTime() {
        Date date = new Date();
        simpMessagingTemplate.convertAndSend("/topic/date", date);
    }

    public void send() {
        simpMessagingTemplate.convertAndSend("/topic/type", "typing...");
    }

    public void online() {
        simpMessagingTemplate.convertAndSend("/topic/online", "online");
    }
}
