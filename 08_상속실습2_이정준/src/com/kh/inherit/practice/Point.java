package com.kh.inherit.practice;

public class Point {

	// 필드
	private int x = 0;
	private int y = 0;

	// 생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드
	public void draw() {
		System.out.printf("(x, y) : (%d, %d)\n", x, y);
	}

}
