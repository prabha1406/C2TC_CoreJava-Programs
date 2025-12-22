package com.tnsif.InterDemo;


interface Fruits{
	
 void sweet() ; //declaration
 
 //void sour();
	
}



public class InterfaceExp implements Fruits {

	public void sweet() {
		System.out.println("The fruits are sweet!!!"); //implementation
	}
	
	
	
	public static void main(String[] args) {
		
		
		InterfaceExp obj1 = new InterfaceExp();
		obj1.sweet();

	}

}
