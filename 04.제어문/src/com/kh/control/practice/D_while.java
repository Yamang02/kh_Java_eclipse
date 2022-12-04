package com.kh.control.practice;

import java.util.Scanner;

public class D_while {
	/*
	 * while문
	 *   [표현법]
	 *   	[초기식(제어변수)]
	 *   
	 *   	while(조건식) {
	 *   		.. 실행 코드 ..
	 *   	
	 *   	[증감식, 분기문]
	 *   
	 *   	}
	 *   
	 */
	public void method1() { // 1부터 랜덤값(1 ~ 10)까지의 합계

	// 변수 선언
	int i = 1; //while 제어 변수
	int sum = 0; // 결과값
	int random = (int) (Math.random() * 10 + 1); // 임의의 한계값
	
	// 계산
	while(i <= random) { // 조건만 보고 처리할 때는 while이 더 편리
		sum += i;
		i++; // 증감식(while 조건식 false)
		
	}
	// 결과 출력
	System.out.printf("1부터 %d까지의 합 : %d\n", random, sum);
	}

	/*
	 *  사용자에게 계속 문자열을 입력 받고 그 문자열을 출력한다.
	 *  단, "exit" 문자열을 입력하면 프로그램을 종료한다.
	 */
	public void method2() { 
		
	// 변수 선언
	String input = "프로그램 시작"; // 입력받을 문자열
	
	// scanner import
	Scanner scanner = new Scanner(System.in);
//	
//	
//	// 계산
//	while (true) {
//		System.out.print("문자열을 입력해주세요. > ");
//		input = scanner.nextLine();
//		
//		// 탈출문
//		if ("exit".equals(input)) {
//			System.out.println("exit가 입력되어 프로그램을 종료합니다.");
//			scanner.close();
//			break;
//		}
//		System.out.println(input);
//	
//	}
		while (!("exit".equals(input))) {
			System.out.println(input);
			System.out.print("문자열을 입력해주세요. > ");
			input = scanner.nextLine();
			
		}
		
		System.out.println("exit가 입력되어 프로그램을 종료합니다.");
		scanner.close();
	}
	/*
	 * 실습문제 2
	 * 사용자가 입력한 단을 출력하시오.
	 * 예시) 
	 *  단 수(2~9)를 입력해주세요. 
	 *  범위가 넘어갈 경우 "1 ~ 9 사이의 양수를 입력하여야 합니다."
	 */
	
	public void practice() {
		// 변수 선언
		int dan = 0; //입력받을 단 초기화
		int i = 1; // while 제어 변수
		
		// 사용자 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 단을 입력해주세요 > ");
		dan = scanner.nextInt();
		scanner.close();
		
		// 사용자 입력 확인 및 계산
		if (!(dan >= 2 && dan <= 9)) { // 적절한 값을 입력하지 않았을 경우 출력
			System.out.println("2 ~ 9 사이의 양수를 입력하여야 합니다.");
			
			return;
		} else { // 적절한 값을 입력하였을 경우 출력
			System.out.printf("====%d단====\n", dan);
			while (i <=9) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);	 // 단 출력
				i++;
			}
		}
	}
	/*
	 * do-while문
	 *   [표현법]
	 *   
	 *     [초기식]
	 *   
	 *     do {
	 *     
	 *       .. 실행 코드 ..
	 *     
	 *     } while(조건식);
	 * 
	 */

	public void method3() {
		// 조건에 상관없이 무조건 한번은 출력이 되는지 확인
		int num = 1;
		while(num == 0) {
			System.out.println("while문 실행");
		}
		do {
			System.out.println("do-while문 실행");
		} while (num == 0);
	}
	
	/*
	 * 예시) 
	 * ========== 메뉴 ==========
	 * 1. C_For 클래스의 method1() 실행
	 * 2. C_For 클래스의 method2() 실행
	 * 3. C_For 클래스의 method3() 실행
	 * Q(q). 프로그램 종료
	 * =========================
	 * > //입력받을 부분
	 * 프로그램이 종료됩니다.
	 * 다른 입력 시 메뉴 다시 출력
	 * 
	 */
	public void method4() {

		char menu = '\u0000';
		Scanner scanner = new Scanner(System.in);
		C_For example = new C_For();
		
		do { 
			System.out.println("========== 메뉴 ==========");
			System.out.println("1. C_For 클래스의 method1() 실행");
			System.out.println("2. C_For 클래스의 method2() 실행");
			System.out.println("3. C_For 클래스의 method3() 실행");
			System.out.println("Q(q). 프로그램 종료");
			System.out.println("========================");
			System.out.print("> ");
			
			menu = scanner.nextLine().charAt(0);
		
			switch (menu) {
				case '1':
					System.out.println("C_For 클래스의 method1() 실행합니다");
					example.method1();
					break;
				case '2':
					System.out.println("C_For 클래스의 method2() 실행합니다");
					example.method2();
					break;
				case '3':
					System.out.println("C_For 클래스의 method3() 실행합니다");
					example.method3();
					break;
				
				case 'Q':
				case 'q':
					System.out.println("프로그램이 종료됩니다.");
					scanner.close();
					
					return;
				default:
					System.out.println("메뉴를 잘못 입력했습니다.");
			}
			
		} while (true);
		
	}

}


	


	