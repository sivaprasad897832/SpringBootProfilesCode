package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;
@Component
@Profile("defualt")
public class NotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("for common users");
		
	}

}
