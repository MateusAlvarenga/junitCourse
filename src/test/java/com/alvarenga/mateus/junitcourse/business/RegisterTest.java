package com.alvarenga.mateus.junitcourse.business;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RegisterTest {
	
	@Mock
	RegisterService registerService;
	
	@InjectMocks
	Register register;
	
	@Test
	public void testRegister() {

		when(registerService.getListOfInts())
			.thenReturn(new int[]{5,5,5});

		int[] values = register.doubleInts();
		
		assertArrayEquals(new int[] {10,10,10}, values);
	}

}
