package com.jaruratcare.model;

import lombok.Data;

@Data
public class WhatsAppMessage {
	private String senderName;
    private String mobileNumber;
    private String messageContent;
}
