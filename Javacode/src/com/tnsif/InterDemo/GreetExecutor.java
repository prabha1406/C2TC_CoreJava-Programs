package com.tnsif.InterDemo;

public class GreetExecutor {
	

	public static void main(String[] args) {
		
		//lambda expression
		
		GreetDemo gd = () -> {
			System.out.println("Hi All! Welcome to the Java Session");
		};
		
		gd.greet();
		

	}

}
