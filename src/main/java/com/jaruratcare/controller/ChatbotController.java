package com.jaruratcare.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.jaruratcare.model.WhatsAppMessage;

@RestController
@RequestMapping("/api")
public class ChatbotController {

    private static final Logger logger = LoggerFactory.getLogger(ChatbotController.class);

    @PostMapping("/webhook")
    public String handleWhatsAppMessage(@RequestBody WhatsAppMessage request) {
        
        logger.info("New Message from {}: {}", request.getSenderName(), request.getMessageContent());

        String incomingText = request.getMessageContent().trim();
        
        if (incomingText.equalsIgnoreCase("Hi")) {
            return "Hello";
        } else if (incomingText.equalsIgnoreCase("Bye")) {
            return "Goodbye";
        } else {
            return "Message Received!";
        }
    }
}