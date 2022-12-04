package com.kh.control.practice;

public class E_break {
	/*
	 * break 문
	 *  [표현법]
	 *    반복문/switch(조건식) {
	 *     [break;]
	 *    }
	 *  
	 *   - break문은 반복문과 switch문의 실행을 중지하고 빠져나갈 때 사용한다.
	 *   - 반복문이 중첩되어 있는 경우 break문이 포함되어 있는 반복문만 빠져나간다. 
	 *    
	 */
	
	public void method1() {
		// 1 ~ 10까지 출력
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		
		// 2 ~ 9단까지 출력
		for (int i = 2; i <= 9; i++) {
			if (i == 3) {
				break;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}

	public void method2() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계를 반복문을 통해서 출력한다.
		// 단, 랜덤값이 5가 나오면 프로그램을 종료한다.

//		=== for 문을 이용한 break 문 ==================================
		
//		int sum = 0;
//		int random = 0;
//		
//		for (;;){
//			sum = 0;
//			random = (int)((Math.random()*10)+1);
//							
//			for (int i = 1; i <= random; i++) {
//				sum += i;
//			}
//			System.out.printf("1부터 %d까지의 합계 = %d",random, sum);
//			System.out.println();
//			
//			if (random == 5) {
//				break;
//			}
//		}
		
//		=== while문을 이용한 break 문 ===================================
		
//		int sum = 0;
//		int random = 0;
//		
//		while (true) {
//			sum = 0;
//			random = (int) (Math.random()*10+1);
//			
//			if(random == 5) {
//				break;
//			}
//		
//			for (int i = 1; i <= random; i++) {
//				sum += i;
//			}
//
//			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
//		}
//		
//		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);
		
//		=== do-while 문을 이용한 break문 ================================
//		
//		int sum = 0;
//		int random = 0;
//
//		do {
//			sum = 0;
//			random = (int) (Math.random()*10+1);
//			
//			if(random == 5) {
//				System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);	
//				break;
//			}
//		
//			for (int i = 1; i <= random; i++) {
//				sum += i;
//			}
//			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
//		} while (true);
		
//		=== while 의 false 값을 이용한... ================================		

		int sum = 0;
		int random = 0;
		
		while (!(random == 5)) {
			sum = 0;
			random = (int) (Math.random()*10+1);
			
					for (int i = 1; i <= random; i++) {
				sum += i;
			}

			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
		}
		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.", random);
	
	}
}
