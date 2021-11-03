package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoTest {
	

	
	@Test
	public void sum() {
		
		System.out.println("Sum Method");
		int a=10;
		int b=20;
		int c=10;
		Assert.assertEquals(30, a+b+c);
	}
	
	@Test
	public void sub() {
		
		System.out.println("sub Method");

		int a=10;
		int b=20;
		Assert.assertEquals(22, b-a);
	}
	
	@Test
	public void mul() {
		
		System.out.println("mul Method");

		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
	

}
