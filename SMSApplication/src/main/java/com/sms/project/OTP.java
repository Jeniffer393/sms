package com.sms.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OTP {
	@Id
	private int otp;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public OTP(int otp) {

		this.otp = otp;
	}

	public OTP() {

	}

}
