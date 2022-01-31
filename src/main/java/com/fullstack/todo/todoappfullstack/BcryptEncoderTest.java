package com.fullstack.todo.todoappfullstack;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedStr=null;
		for(int i=0; i<10; i++) {
			 encodedStr = encoder.encode("udhay707");	
		}
		System.out.println(encodedStr);
		
	}

}
