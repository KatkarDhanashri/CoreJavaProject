package com.java.Abstraction;

public class Rectangle extends Shape{
	
	float width,height;
	
	public Rectangle() {
		width=3.2f;
		height=2.0f;
	}
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

		public void calArea() {
		this.area=width*height;
		
	}

}
