package com.sample.twilio.testapis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Message;

@RestController
public class TwilioController {
	
	@GetMapping("/")
	public String testTwilioSampleAPI() {
		return "Test Twilio Sample API";
	}
	
	@PostMapping("/api/patient/{patientId}")
	public String twilioCallbackResponse(@PathVariable String patientId) {
		System.out.println("Twilio Callback API called with patient ID " + patientId);
		
		return new MessagingResponse.Builder().message(
			      new Message.Builder("Thanks for your message").build())
			        .build()
			        .toXml();
	}
}
