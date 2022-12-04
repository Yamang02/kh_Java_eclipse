package com.kh.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if문 [표현법] if(조건식 : 논리값(boolean)) { .. 실행 코드 .. }
	 * 
	 * - 조건식의 경우에는 비교 연산자, 논리 연산자를 주로 사용한다. - 조건식의 결과가 true이면 중괄호({}) 블록을 실행한다. -
	 * 조건식의 결과가 false이면 중괄호({}) 블록을 실행하지 않는다.
	 * 
	 */
	public void method1() {
		// 입력받은 정수값이 홀수인지 짝수인지 판별하라.

		int num = 0;

		System.out.println("임의의 정수 하나를 입력하세요 >");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수이다", num);
		}

		if (num % 2 == 1) {
			System.out.printf("%d는 홀수이다", num);
		}

		scanner.close();
	}

	/*
	 * if - else 문 [표현법] if(조건식 : 논리값(boolean)) { .. 실행 코드 .. } else { .. 실행 코드 .. }
	 * 
	 * - 조건식의 경우에는 비교 연산자, 논리 연산자를 주로 사용한다. - 조건식의 결과가 true이면 if문 안의 중괄호({}) 블록을
	 * 실행한다. - 조건식의 결과가 false이면 else문 안의 중괄호({}) 블록을 실행하지 않는다.
	 * 
	 */

	public void method2() {
		// 입력받은 정수값이 홀수인지 짝수인지 판별하라.

		int num = 0;

		System.out.println("임의의 정수 하나를 입력하세요 >");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

		if ((num % 2) == 0) {
			System.out.printf("%d(은/는) 짝수이다", num);
		} else {
			System.out.printf("%d(은/는) 홀수이다", num);
		}
		scanner.close();

	}

	public void method3() {
		/*
		 * 사용자에게 이름을 받아서 본인 이름이 맞는지 확인하기
		 */

		// 사용자 이름 받기 , 출력해주기, 확인하기
		// 변수 선언
		String name = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("이름을 입력하세요. > ");
		name = scanner.nextLine();

		scanner.close();

//		문자열의 동등 비교 시에는 String 클래스에서 제공하는 equals() 메소드를 이용해서 비교해야 한다.
//		System.out.println("문인수" == "문인수");
//		System.out.println("문인수" == new String("문인수"));
//		System.out.println(new String("문인수").equals("문인수"));

		if ("이정준".equals(name)) {
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}

	}

	/*
	 * if-else if-else 문 [표현법] if (조건식) { .. 실행 코드.. } else if (조건식) { .. 실행 코드.. }
	 * else if (조건식) { .. 실행 코드.. } [else { .. 실행 코드.. }]
	 * 
	 * - 같은 비교 대상으로 여러 개의 조건을 제시할 때 사용한다. - 조건이 모두 false가 나오게 되면 else 구문을 실행한다.
	 * (else 문은 생략 가능)
	 * 
	 */

	public void method4() {
		// 사용자에게 알파벳 하나를 입력 받아 대문자인지 소문자인지 확인

		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자 입력 > ");
		ch = scanner.nextLine().charAt(0);

		scanner.close();

		System.out.println(ch);

		if ((ch >= 'A') && (ch <= 'Z')) {
			// 대문자
			System.out.printf("%c(은/는) 알파벳 대문자이다.", ch);
		} else if ((ch >= 'a') && (ch <= 'z')) {
			// 소문자
			System.out.printf("%c(은/는) 알파벳 소문자이다.", ch);
		} else {
			// 알파벳 아님
			System.out.printf("%c(은/는) 알파벳이 아니다.", ch);
		}

	}

	/*
	 * 실습 문제 1
	 * 
	 * 두 정수를 입력받고 + 또는 -를 입력받아서 계산을 출력하라 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
	 * 
	 * 
	 */

	public void practice1() {

		// 두 정수 입력받기 변수
		int num1 = 0;
		int num2 = 0;

		// 연산자 입력
		String ch = "";

		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 > ");
		num1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 > ");
		num2 = scanner.nextInt();
		System.out.print("+ 나 - 중 하나를 입력하세요 > ");
		scanner.nextLine();
		ch = scanner.nextLine();
		System.out.println(ch);

		if ("+".equals(ch)) {
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
		} else if ("-".equals(ch)) {
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
		} else {
			System.out.printf("잘못 입력하셨습니다. 입력하신값은 +나 -가 아닙니다.", ch);
		}

		scanner.close();
	}

	/*
	 * 실습 문제 2
	 * 
	 * 사용자에게 점수 (0~100)를 입력받아서 점수별로 등급을 출력하라 - 90 이상 A - 80 이상 ~ 90 미만 B - 70 이상 ~
	 * 80 미만 C - 60 이상 ~ 70 미만 D - 50 이상 ~ 60 미만 E - 60 미만 F
	 */

	public void practice2() {

		int score = 0;

		// 점수 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 점수를 입력하세요 >");

		score = scanner.nextInt();
		scanner.close();

		if (score >= 90) {
			System.out.printf("당신의 점수는 %d이고, 등급은 A입니다.", score);
		} else if (score < 90 && score >= 80) {
			System.out.printf("당신의 점수는 %d이고, 등급은 B입니다.", score);
		} else if (score < 80 && score >= 70) {
			System.out.printf("당신의 점수는 %d이고, 등급은 C입니다.", score);
		} else if (score < 70 && score >= 60) {
			System.out.printf("당신의 점수는 %d이고, 등급은 D입니다.", score);
		} else {
			System.out.printf("당신의 점수는 %d이고, 등급은 F입니다.", score);
		}

	}

}
