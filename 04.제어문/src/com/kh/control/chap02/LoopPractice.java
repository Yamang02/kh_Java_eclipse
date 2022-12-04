package com.kh.control.chap02;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		// 변수 선언, scanner 임포트
		int value = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 입력, 값 확인
		System.out.print("1이상의 숫자를 입력하세요 > ");
		value = scanner.nextInt();
		scanner.close();

		if (value < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 1부터 해당 값까지의 숫자들을 모두 출력
		for (int i = 1; i <= value; i++) {
			System.out.printf("%d ", i);
		}

	}

	public void practice2() {
//		// 변수 선언, scanner 임포트
//		int value = 0;
//		Scanner scanner = new Scanner(System.in);
//
//		do {
//			// 사용자 입력, 값 확인
//			System.out.print("1이상의 숫자를 입력하세요 > ");
//			value = scanner.nextInt();
//
//			if (value < 1) {
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//			}
//		} while (value < 1);
//
//		scanner.close();
//
//		// 1부터 해당 값까지의 숫자들을 모두 출력
//		for (int i = 1; i <= value; i++) {
//			System.out.printf("%d ", i);
//		}

		// 변수 선언, scanner 임포트

		int value = 0;
		Scanner scanner = new Scanner(System.in);

		for (; (value < 1);) {
			// 사용자 입력, 값 확인
			System.out.print("1이상의 숫자를 입력하세요 > ");
			value = scanner.nextInt();

			if (value < 1) {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		scanner.close();
		// 1부터 해당 값까지의 숫자들을 모두 출력
		for (int i = 1; i <= value; i++) {
			System.out.printf("%d ", i);
		}
	}

	public void practice3() {
		// 변수 선언, scanner 임포트
		int value = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 입력, 값 확인
		System.out.print("1이상의 숫자를 입력하세요 > ");
		value = scanner.nextInt();
		scanner.close();

		if (value < 1) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 해당 값부터 1까지의 숫자들을 모두 출력
		for (int i = value; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
	}

	public void practice4() {
		// 변수 선언, scanner 임포트
		int value = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			// 사용자 입력, 값 확인
			System.out.print("1이상의 숫자를 입력하세요 > ");
			value = scanner.nextInt();

			if (value < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (value < 1);

		scanner.close();

		// 해당 값부터 1까지의 숫자들을 모두 출력
		for (int i = value; i >= 1; i--) {
			System.out.printf("%d ", i);
		}
	}

	public void practice5() {
		// 변수 선언, scanner 임포트
		int value = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 입력, 값 확인
		System.out.print("정수를 하나 입력하세요 : ");
		value = scanner.nextInt();
		scanner.close();

		// 1부터 해당 값까지의 합
		for (int i = 1; i < value; i++) {
			System.out.printf("%d + ", i);
			sum += i;
		}
		System.out.printf("%d = %d", value, sum + value);
	}

	public void practice6() {
		// 변수 선언, scanner 임포트
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			// 사용자 입력, 값 확인
			System.out.print("첫 번째 숫자 : ");
			num1 = scanner.nextInt();
			if (num1 < 1) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}
			System.out.print("두 번째 숫자 : ");
			num2 = scanner.nextInt();
			if (num2 < 1) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
			}

		} while (!(num1 >= 1) && (num2 >= 1));
		scanner.close();
		if (num2 < num1) {
			for (int i = num2; i <= num1; i++) {
				System.out.printf("%d ", i);
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.printf("%d ", i);
			}
		}
		// 1부터 해당 값까지의 숫자들을 모두 출력
		
	}

	public void practice7() {
		// 변수 선언, scanner 임포트
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 입력, 값 확인

		do {
			System.out.print("첫 번째 숫자 : ");
			num1 = scanner.nextInt();
			if (num1 < 1) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
				scanner.close();
				return;
			}
		} while (num1 < 1);

		do {
			System.out.print("두 번째 숫자 : ");
			num2 = scanner.nextInt();
			if (num2 < 1) {
				System.out.println("1이상의 숫자만을 입력해주세요.");
				scanner.close();
				return;
			}
		} while (num1 < 2);

		if (num2 < num1) {
			System.out.println("두 번째 숫자가 더 작습니다!");
			scanner.close();
			return;
		}
		scanner.close();

		// 1부터 해당 값까지의 숫자들을 모두 출력
		for (int i = num1; i <= num2; i++) {
			System.out.printf("%d ", i);
		}
	}

	public void practice8() {
		// 변수 선언, 스캐너 임포트
		int value = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 값 입력
		System.out.println("숫자 : ");
		value = scanner.nextInt();

		// 구구단 출력
//		for (int i = 2; i <= 9 ; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i*j);
//			}
//		}
		scanner.close();
		System.out.printf("===== %d 단 =====\n", value);
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", value, i, value * i);
		}
	}

	public void practice9() {
		// 변수 선언, 스캐너 임포트
		int value = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 값 입력
		System.out.println("숫자 : ");
		value = scanner.nextInt();
		if (!(2 <= value && 9 >= value)) {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
			scanner.close();
			return;
		}

		// 구구단 출력
		for (int i = value; i <= 9; i++) {
			System.out.printf("===== %d 단 =====\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	public void practice10() {
		// 변수 선언, 스캐너 임포트
		int value = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			// 사용자 값 입력
			System.out.println("숫자 : ");
			value = scanner.nextInt();
			if (!(2 <= value && 9 >= value)) {
				System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
				scanner.close();
				return;
			}
		} while (!(2 <= value && 9 >= value));
		scanner.close();
		// 구구단 출력
		for (int i = value; i <= 9; i++) {
			System.out.printf("===== %d 단 =====\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}

	public void practice11() {
		// 변수 선언, 스캐너 임포트
		int sNum = 0; // 시작 숫자
		int cDif = 0; // 공차
		Scanner scanner = new Scanner(System.in);

		// 사용자 값 입력 받기
		System.out.print("시작 숫자 : ");
		sNum = scanner.nextInt();
		System.out.print("시작 숫자 : ");
		cDif = scanner.nextInt();

		// 계산 및 출력
		for (int i = 0; i < 10; i++) {
			int num = sNum + (i * cDif);
			System.out.printf("%d ", num);
		}
		scanner.close();
	}

	public void practice12() {
		// 정수 두 개와 연산자(문자열로) 입력 받기 ; 입력받은 연산자에 따라 알맞은 결과 출력
		// 연산자 입력 시 exit 값 입력되기 전까지 무한 반복
		// exit가 들어오면 "프로그램을 종료합니다."를 출력하고 종료

		// 연산자 나누기 + 두 번째 정수가 0으로 들어오면 문구 출력
		// 없는 연산자 = 다시 입력해주세요
		// 위 두 경우 모두 다시 연산자부터 입력

		// 변수 선언, 스캐너 임포트
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		String op = ""; // 연산자
		Scanner scanner = new Scanner(System.in);

		do {
			// 숫자와 연산자 입력 받기;
			System.out.print("연산자(+, -, *, /, %) : \n");
			op = scanner.nextLine();
			if ("exit".equals(op)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수 1 : \n");
			num1 = scanner.nextInt();
			System.out.print("정수 2 : \n");
			num2 = scanner.nextInt();
			scanner.nextLine();

			if ((op.equals("/")) && (num2 == 0)) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}

			switch (op) {
			case "+":
				result = num1 + num2;

				break;
			case "-":
				result = num1 - num2;

				break;
			case "*":
				result = num1 * num2;

				break;
			case "/":
				result = num1 / num2;

				break;
			case "%":
				result = num1 % num2;

				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.printf("%d %s %d = %d\n", num1, op, num2, result);

		} while (!("exit".equals(op)));
		scanner.close();
	}
}
