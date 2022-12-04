package com.kh.inherit.practice;

public class Rectangle extends Point {

	// 필드
	private int width = 0;
	private	int height = 0;

	
	//생성자
	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// G & S
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	//메소드
	@Override
	public void draw() {
		super.draw();
		System.out.printf("면적 : %d\n", width*height);
		System.out.printf("둘레 : %d\n", 2*(width+height));
		
	}
	
	
	
}
