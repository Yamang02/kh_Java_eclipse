package com.kh.inherit;

import com.kh.inherit.practice.Circle;
import com.kh.inherit.practice.Rectangle;

public class Application {

	public static void main(String[] args) {

		Circle[] circles = new Circle[2];
		Rectangle[] rectangles = new Rectangle[2];
		
		circles[0] = new Circle(1, 2, 3);
		circles[1] = new Circle(3, 3, 4);
		rectangles[0] = new Rectangle(-1, -2, 5, 2);
		rectangles[1] = new Rectangle(-2, 5, 2, 8);
	
		System.out.println("====== circle =========");
		for (int i = 0; i < circles.length; i++) {
			circles[i].draw();
		}
		
		System.out.println("====== rectangle =========");
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i].draw();
		}
	}

}
