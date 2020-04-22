package com.sms.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SMSService implements CommandLineRunner {
	public static final String ACCOUNT_SID = "ACd68b4fbc5782622d2b5fa28e708b0013";
	public static final String AUTH_TOKEN = "8bab5e3c1e89eaedd85c5839dd736c6c";
	public static final int otp = (int) (Math.random() * 1000000);

	@Override
	public void run(String... args) throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message.creator(new PhoneNumber("+917760047359"), new PhoneNumber("+19892828797"),
				"Welcome User to Online bus reservation!! Your OTP is " + otp).create();

	}

}
