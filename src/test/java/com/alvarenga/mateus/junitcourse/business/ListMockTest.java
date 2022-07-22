package com.alvarenga.mateus.junitcourse.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ListMockTest {
	
	static List listaMockada;
	
	@BeforeAll
	public static void setup() {
		listaMockada = mock(List.class);
	}
	
	@Test					
	public void test() {		 
		when(listaMockada.size())
			.thenReturn(5)
			.thenReturn(10);
		
		when(listaMockada.get(anyInt()))
			.thenReturn(5);
		
		assertEquals(5,listaMockada.get(2));
		assertEquals(5,listaMockada.size());
		assertEquals(10,listaMockada.size());	
		verify(listaMockada).get(2);
	}
	
	@Test
	public void verifying() {
		listaMockada.size();
		verify(listaMockada).size();
		
	}
	
	

}
