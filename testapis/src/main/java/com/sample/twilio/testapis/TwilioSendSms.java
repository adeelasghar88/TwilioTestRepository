package com.sample.twilio.testapis;

import java.net.URI;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class TwilioSendSms {
	
	public static final String ACCOUNT_SID = "ACa492b87e042ea55c29c5a8817ec4ccd9";
    public static final String AUTH_TOKEN = "d4f5013e2b904381ba48f84733682dcd";
	
	public void sendSMS() {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
		Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+12679322184"),
                new com.twilio.type.PhoneNumber("+12159900519"),
                "Do you want to continue? Press 'Y' for yes and 'N' for No ...")
            .setStatusCallback(URI.create("https://desolate-bayou-22407.herokuapp.com/api/patient/123456789"))
            .create();

        System.out.println(message.getSid());
	}

}
