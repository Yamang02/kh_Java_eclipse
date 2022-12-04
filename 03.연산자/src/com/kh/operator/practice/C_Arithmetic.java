package com.kh.operator.practice;

public class C_Arithmetic {
	/* 
	 * 산술 연산자
	 * 	+ (더하기)
	 * 	- (빼기)
	 * 	* (곱하기)
	 * 	/ (나누기)
	 * 	% (나머지)
	 * 	
	 * 	 */
	
	public void method1() {
		// 정수의 산술 연산
		int num1 = 10;
		int num2 = 3;
		
//		System.out.println("num1 + num2 = " + num1 + num2); 문자열 연결 연산자로 인식, num1 + num2 에 괄호를 씌워 해결
		System.out.printf("num1 + num2 = %d\n", num1 + num2);
		System.out.printf("num1 - num2 = %d\n", num1 - num2);
		System.out.printf("num1 * num2 = %d\n", num1 * num2);
		System.out.printf("num1 / num2 = %d\n", num1 / num2);
		System.out.printf("num1 %% num2 = %d\n\n", num1 % num2); 
//		System.out.println("num1 % num2 = " + (num1 % num2));
		

		// 실수의 산술 연산
		double dNum1 = 35.0;
		double dNum2 = 10.0;
		
		System.out.printf("dNum1 + dNum2 = %.1f\n", dNum1 + dNum2);
		System.out.printf("dNum1 - dNum2 = %.1f\n", dNum1 - dNum2);
		System.out.printf("dNum1 * dNum2 = %.1f\n", dNum1 * dNum2);
		System.out.printf("dNum1 / dNum2 = %.1f\n", dNum1 / dNum2);
		System.out.printf("dNum1 %% dNum2 = %.1f\n", dNum1 % dNum2); 
//		System.out.println("dNum1 % dNum2 = " + (dNum1 % dNum2));
		
//		 참고
//		System.out.println(5 / 0); ArithmeticException
//		System.out.println(5 / 0.0);
//		System.out.println(5 % 0.0); Not a Number
		
		
	}
	

}
