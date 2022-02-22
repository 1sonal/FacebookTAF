package com.facebook.generic;

public class BaseTest {
	public void beforeMethod(){
		System.out.println("Environment intialised");
	}
	
	public void afterMethod(){
		System.out.println("Close Browser");
	}
}
