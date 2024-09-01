package com.springfundamentals.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

	private String receiverAddress;

	public void send(String receiverAddress, String subject, String content) {
		this.receiverAddress = receiverAddress;

		someProcessing();

		send(subject, content);
	}

	private void send(String subject, String content) {
		System.out.println("Send email with subject '" + subject + "' and content '" + content + "' to " + this.receiverAddress);
	}

	private void someProcessing() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
