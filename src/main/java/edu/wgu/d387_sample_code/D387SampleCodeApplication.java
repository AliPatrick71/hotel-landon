package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class D387SampleCodeApplication {


	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		MessageService messageService = new MessageService();

		// Create threads to display messages in different languages
		Thread englishThread = new Thread(() -> {
			String message = messageService.getMessage("welcome.message", Locale.ENGLISH);
			System.out.println("English Thread: " + message);
		});

		Thread frenchThread = new Thread(() -> {
			String message = messageService.getMessage("welcome.message", Locale.FRANCE);
			System.out.println("French Thread: " + message);
		});

		// Start the threads
		englishThread.start();
		frenchThread.start();

		// Wait for both threads to finish
		try {
			englishThread.join();
			frenchThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
