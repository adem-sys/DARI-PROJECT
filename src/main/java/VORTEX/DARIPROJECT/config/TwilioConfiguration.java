package VORTEX.DARIPROJECT.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {
	

    private String accountSid;
    private String authToken;
    private String trialNumber;
	public TwilioConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TwilioConfiguration(String accountSid, String authToken, String trialNumber) {
		super();
		this.accountSid = accountSid;
		this.authToken = authToken;
		this.trialNumber = trialNumber;
	}
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getTrialNumber() {
		return trialNumber;
	}
	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}


}
