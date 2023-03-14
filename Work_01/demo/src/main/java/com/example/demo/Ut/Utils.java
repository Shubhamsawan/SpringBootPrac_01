package com.example.demo.Ut;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	
//	 for unique user id
	private final Random RANDOM = new SecureRandom();
	private final String ALPHBET = "012233456789ABCDFRERTTYUTYRJHGNasdsdvsdfgrthtrbdfb";
	
	public String generateUserId(int lenght) {
		return generateRandomString(lenght);
	}

	private String generateRandomString(int lenght) {

		StringBuilder returnValue = new StringBuilder();
		
		for(int i = 0; i< lenght; i++) {
			returnValue.append(ALPHBET.charAt(RANDOM.nextInt(ALPHBET.length())));
			
		}
		return new String(returnValue);
	}
	

}
