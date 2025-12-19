package com.tnsif.nonaccessmodifier;


abstract class Shape_exa{
	
	abstract void draw(); //functionality or declaration

}

class Square extends Shape_exa{
	
	void draw() {
		System.out.println("Drawing a square");
	}
	
}

public class Shape {

	public static void main(String[] args) {
		
		Square s = new Square();
		s.draw();
		
		
		

	}

}
