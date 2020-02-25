package com.perficient;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverImpl {

	@JmsListener(destination = "coveo", containerFactory = "myFactory")
	public void receiveMessage(ReceivedMsg msg) {
		System.out.println("Received <" + msg + ">");
	}

}
