package com.accenture.lkm.lambdaexp.sample;

public class WelcomeUsers {	
	
	public static void main(String[] args) {		
		Greeting greeting = (name) -> {System.out.println("Welcome "+name);};		
		greeting.greet("Seeta");
	}
}
