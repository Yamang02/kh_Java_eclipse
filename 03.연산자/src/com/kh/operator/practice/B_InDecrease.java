package com.kh.operator.practice;

public class B_InDecrease {
	
	/*
	 * 증감 연산자
	 *   [표현법]
	 *   	(증감 연산자)값; or 값(증감 연산자);
	 *   
	 *   - 증감 연산자는 피연산자의 값을 1 증가시키거나 1 감소시키는 연산자이다.
	 *   - ++ (증) --(감)
	 *   전위 연산 : (증감 연산자)값 먼저 증감 연산을 수행하고 다른 연산을 수행한다. (문장 시작 전)
	 *   후위 연산 : 값(증감 연산자) 먼저 다른 연산을 수행하고 증감 연산을 수행한다. (문장이 끝난 후)
	 */
	
	public void method1() {
		int number = 10;
		
		// 전위 연산자 테스트
		System.out.printf("전위 연산자 적용 전 number의 값 : %d\n", number);
		System.out.printf("1회 수행 후 number의 값 : %d\n", ++number); // number = number +1; 같은 결과를 출력 
		System.out.printf("2회 수행 후 number의 값 : %d\n", ++number);
		System.out.printf("3회 수행 후 number의 값 : %d\n", ++number);
		System.out.printf("전위 연산자 적용 후 number의 값 : %d\n\n", number);
		
		// 전위 연산자 테스트
		System.out.printf("후위 연산자 적용 전 number의 값 : %d\n", number);
		System.out.printf("1회 수행 후 number의 값 : %d\n", number++);
		System.out.printf("2회 수행 후 number의 값 : %d\n", number++);
		System.out.printf("3회 수행 후 number의 값 : %d\n", number++);
		System.out.printf("후위 연산자 적용 후 number의 값 : %d\n", number);
	}

	public void method2() {

		int number = 20;
		int result = number++ *3; // 60
		
		System.out.printf("number : %d\n", number); // 21
		System.out.printf("result : %d\n", result); // 60
		
		int number1 = 10;
		int number2 = 20;
		
		int number3 = 30;
		
		System.out.println(number1++); // 10
		// 11
		System.out.println((++number1) + (number2++)); // 32
		// 12, 21
		System.out.println((number1++) + (--number2) + (--number3)); // 61 								
		// 13, 20, 29
		
		System.out.printf("number : %d\n", number1); // 13
		System.out.printf("number : %d\n", number2); // 20
		System.out.printf("number : %d\n", number3); // 29
	}

}
