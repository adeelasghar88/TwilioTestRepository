package com.sample.twilio.testapis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwilioController {
	
	@GetMapping("/api/testTwilio")
	public String testTwilioSampleAPI() {
		return "Test Twilio Sample API";
	}
	
	@PostMapping("/api/patient/{patientId}")
	public String twilioCallbackResponse(@PathVariable String patientId) {
		System.out.println("Twilio Callback API called with patient Id " + patientId);
		return patientId;
	}
}
