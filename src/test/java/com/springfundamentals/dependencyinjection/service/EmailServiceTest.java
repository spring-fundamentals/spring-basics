package com.springfundamentals.dependencyinjection.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class EmailServiceTest {

	@Autowired
	private EmailService emailService;

	@Test
	void sequentialCalls() {
		this.emailService.send("hermine.granger@hogwarts.edu", "Secret Information", "Good Morning Ms. Granger.");
		this.emailService.send("ron.weasley@hogwarts.edu", "Secret Information", "Good Morning Mr. Weasley.");
		this.emailService.send("harry.potter@hogwarts.edu", "Secret Information", "Good Morning Mr. Potter.");
	}

	@Test
	void parallelCalls() throws InterruptedException {

		ExecutorService executorService = Executors.newCachedThreadPool();

		Callable<Void> request1 = createRequestFor("hermine.granger@hogwarts.edu", "Secret Information", "Good Morning Ms. Granger.");
		Callable<Void> request2 = createRequestFor("ron.weasley@hogwarts.edu", "Secret Information", "Good Morning Mr. Weasley.");
		Callable<Void> request3 = createRequestFor("harry.potter@hogwarts.edu", "Secret Information", "Good Morning Mr. Potter.");

		executorService.invokeAll(List.of(request1, request2, request3));
	}

	private Callable<Void> createRequestFor(String emailAddress, String subject, String content) {
		return () -> {
			this.emailService.send(emailAddress, subject, content);
			return null;
		};
	}
}