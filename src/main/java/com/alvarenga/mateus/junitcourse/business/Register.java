package com.alvarenga.mateus.junitcourse.business;

import java.util.Arrays;

public class Register {
	
	private RegisterService registerService;
	
 
	public int[] doubleInts() {		
		return  Arrays.stream(registerService.getListOfInts())
				.map(i -> i * 2).toArray();
	}
	
//	public void setRegisterService(RegisterService register) {
//		registerService = register;
//	}

}
