/**
 * Author: komiloff_doniyor2505@gmail.com
 * Date:1/5/2023
 * Time:5:16 PM
 * Project Name:websocket
 */
package com.example.controller;

import com.example.SendDate;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final SendDate sendDate;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/message")
    public String message() {
        return "message";
    }

    @MessageMapping("/type")
    public void type() {
        sendDate.send();
    }

    @MessageMapping("/online")
    public void online() {
        sendDate.online();
    }
}
