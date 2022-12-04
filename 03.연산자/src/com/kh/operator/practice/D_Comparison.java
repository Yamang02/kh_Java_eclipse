package com.kh.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 비교 연산자
	 *   a < b : a가 b보다 작은가?
	 *   a > b : a가 b보다 큰가? 
	 *   a <= b : a가 b보다 작거나 같은가?
	 *   a >= b  
	 *   a == b : 같은가?
	 *   a != b : 같지 않은가?
	 * 
	 * 	- 비교 연산의 조건을 만족하면 true, 만족하지 않으면 false를 반환한다.
	 */
	
	
	public void method1() {
		
		int num1 = 10, num2 = 25, num3 = 0;
		System.out.printf("%d == %d : %b\n", num1, num2, num1 == num2);
		System.out.printf("%d <= %d : %b\n", num1, num2, num1 <= num2);
		System.out.printf("%d > %d : %b\n", num1, num2, num1 > num2);
		System.out.println();		
		 
		System.out.println('A' == 65);
		System.out.println(3 == 3.0);
		System.out.println(0.1 == 0.1f);
		// 단, 예외가 있다.
		// 부동 소수점 방식은 오차가 생길 수 있기 때문에 대부분의 비교 연산에서는 정수 타입을 사용한다.
		
	}
	public void method2() {
		// 산술 연산 + 비교 연산
		// 사용자에게 입력받은 값이 짝수인지, 홀수인지 판단
		
		int num = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력하세요 >");
		num = scanner.nextInt();
		result = ((num % 2) == 0);
		
		System.out.printf("%d(은/는) 짝수인가요? %b", num, result);
		
		
		scanner.close();
	
		
		
		
	}	
}
