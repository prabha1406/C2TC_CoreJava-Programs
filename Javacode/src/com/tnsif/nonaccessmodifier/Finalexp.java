package com.tnsif.nonaccessmodifier;

final public class Finalexp{
	
	
	final int x = 100;
	
	final void print() {
		System.out.println("Print the value of x: "+ x);
	}

	public static void main(String[] args) {
		
		Finalexp fe = new Finalexp();		
	//	fe.x = 200; not allowed
		fe.print();
		

	}

}

//class Example extends Finalexp{ 
	//void print() FINAL METHOD CAN NOT OVER RIDE
		