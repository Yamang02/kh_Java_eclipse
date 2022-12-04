package com.kh.control.practice;

import java.util.Scanner;

public class C_For {

	public void method1() {
		// 반복문을 사용하지 않을 때
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
	
		// 반복문을 사용할 때
		
//		for (int i = 1; i <= 10 ; i++) {
//			System.out.println(i);
//		}
		
		
		/*
		 * for문
		 *   [표기법]
		 *   	for (초기식; 조건식; 증감식) {
		 *   	.. 실행 코드 ..
		 *   }
		 *   
		 *   - 초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를 선언하고 초기값을 대입한다.
		 *   - 조건식은 반복문이 수행되는 조건을 작성하는 구문으로 조건식의 결과가 true이면 실행 코드를 수행하고, 조건식의 결과가 false이면 실행코드를 수행하지 않고 반복문을 빠져나온다. 
		 *   - 증감식은 반복문을 제어하는 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
		 *   
		 */
		
//		
		System.out.println();
		
		for (int i = 10; i >= 1 ; i--) {
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		// 1부터 10까지의 정수들의 합을 출력
		int sum = 0;
		
		for(int i = 1 ; i <= 10 ; i += 1) { 
			sum += i;
			
		}
		
		System.out.println("합계 : " + sum);
	
	}
	
	public void method3() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계를 구하시오.
		/*
		 * java.lang,Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 발생시킬 수 있다.
		 * // 0.0 부터 0.99... 사이의 
		 * 
		 */
		 
//		double random = Math.random(); // int는 담을 수 없다.
		int random = (int) (Math.random() * 10 + 1);		
		int sum = 0;
		
		for (int i = 1; i <= random; i++) {
			sum += i;			
		}
		
		
		System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
		
		 
				
	}
	
	public void method4() {
		/*
		 * 중첩 for문
		 *   [표현법]
		 *     for(초기식; 조건식; 증감식) {
		 *       .. 실행 코드 ..
		 *       for (초기식; 조건식; 증감식) {
		 *			.. 실행 코드 ..    
		 *       }
		 *       
		 *     .. 실행 코드 .. 
		 *     }
		 */
		
		/*
		 * 2단에서 9단까지 출력
		 *   단은 2 ~ 9까지 1씩 증가(단은 바깥쪽 for문을 통해 해결)
		 *   곱해지는 수는 1 ~ 9까지 1씩 증까(안쪽 for문)		
		 */
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("\n  ==%d단==  \n",i);
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);				
				}
		}
			
	}
	
	public void method5() {
		/*
		 
		 *****
		 *****
		 *****
		 ***** 
		
		 // 행 1 ~ 4까지 반복
		 // 열 5개 고정
		  
		 */
		
		for (int i = 1; i  <= 4; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public void practice1() {
		/*
		 * 실습문제 1
		 * 1부터 사용자가 입력한 수까지의 합계를 구하시오.
		 * 예시) 
		 *  정수 > 10
		 *  총 합계 > 55
		 */
		int num = 0;
		int sum = 0;
		
		// 값 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("10 이상의 정수를 입력하세요. > ");
		num = scanner.nextInt();
		scanner.close();
		
		//계산
		
		for (int i=1; i<= num; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
	}
	
	public void practice2() {
		/*
		 * 실습문제 2
		 * 사용자가 입력한 단을 출력하시오.
		 * 예시) 
		 *  단 수(2~9)를 입력해주세요. 
		 *  범위가 넘어갈 경우 "1 ~ 9 사이의 양수를 입력하여야 합니다."
		 */
		
		int dan = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 단을 입력해주세요 > ");
		dan = scanner.nextInt();
		scanner.close();
		
		if (!(dan >= 2 && dan <= 9)) {
			System.out.println("2 ~ 9 사이의 양수를 입력하여야 합니다.");
			return;
		} else {
			for (int i = 2 ; i <= 9; i++ ) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		}
		
	}

	public void practice3() { //별 찍기
		/*
		 * 아래와 같이 출력 되도록 중첩 for문을 작성하시오.
		 * 
		 * 예시)
		 *   1***
		 *   *2**
		 *   **3*
		 *   ***4
		 *    
		 */
		
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void practice4() { //별 찍기2
		
		/*
		 * 실습 문제 4
		 * 
		 * 아래와 같이 출력되도록 for문을 작성하시오.
		 * 공백 미포함
		 * 
		 * 예시)
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 * 
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}


