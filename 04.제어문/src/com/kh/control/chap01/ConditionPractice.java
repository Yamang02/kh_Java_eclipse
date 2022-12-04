package com.kh.control.chap01;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {

		int input = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("====== 메뉴 ======");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호를 입력하세요 > ");

		input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			break;

		default:
			System.out.println("번호를 다시 입력해주세요");
			scanner.close();
			return;
		}
		scanner.close();
	}

	public void practice2() {

		int input = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력하세요 > ");
		input = scanner.nextInt();

		if ((input > 0) && (input % 2 == 0)) {
			System.out.println("짝수다");
		} else if (!((input % 2 == 0))) {
			System.out.println("홀수다");
		} else if (!(input > 0)) {
			System.out.println("양수만 입력해주세요");
		}

		scanner.close();

	}

	public void practice3() {

		// 변수 선언, 스캐너 임포트
		int kScore = 0;
		int eScore = 0;
		int mScore = 0;
		int scoreSum = 0;
		double scoreAvg = 0.0;
		Scanner scanner = new Scanner(System.in);

		// 사용자 값 입력 받기
		System.out.print("국어 점수를 입력해주세요 > ");
		kScore = scanner.nextInt();
		System.out.print("영어 점수를 입력해주세요 > ");
		eScore = scanner.nextInt();
		System.out.print("수학 점수를 입력해주세요 > ");
		mScore = scanner.nextInt();
		scanner.close();

		// 계산 및 출력
		scoreSum = kScore + eScore + mScore;
		scoreAvg = scoreSum / 3;

		if (((kScore >= 40 && eScore >= 40) && mScore >= 40) && scoreAvg >= 60) {
			System.out.printf("국어 : %d\n", kScore);
			System.out.printf("수학 : %d\n", mScore);
			System.out.printf("영어 : %d\n", eScore);
			System.out.println(" 합계 : " + scoreSum);
			System.out.printf(" 평균 : %.1f\n", scoreAvg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void practice4() {

		// 스캐너 임포트, 변수 선언
		int month = 0;
		Scanner scanner = new Scanner(System.in);

		// 사용자에게 임의의 정수값 입력 받기, 판단
		System.out.print("1 - 12 사이의 달을 입력해주세요. > ");
		month = scanner.nextInt();
		if (!(month >= 1 && month <= 12)) {
			System.out.printf("%d는 잘못 입력된 달입니다.", month);
			scanner.close();

		} else { // 달에 따른 계절 출력
			switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.printf("%d월은 봄입니다.", month);
				break;
			case 6:
			case 7:
			case 8:
				System.out.printf("%d월은 여름입니다.", month);
				break;
			case 9:
			case 10:
			case 11:
				System.out.printf("%d월은 가을입니다.", month);
				break;
			case 12:
			case 1:
			case 2:
				System.out.printf("%d월은 겨울입니다.", month);
				break;
			default:
				break;
			}
		}
	}

	public void practice5() {

		// 변수 선언, 스캐너 임포트
		String ID = "";
		int pw = 0;
		String correctId = "ljj0210";
		int correctPw = 0000;
		boolean login = false;
		Scanner scanner = new Scanner(System.in);

		// 로그인 기능 작성
		do {
			// 사용자 입력
			System.out.printf("아이디? > \n");
			ID = scanner.nextLine();
			System.out.printf("패스워드? > \n");
			pw = scanner.nextInt();
			scanner.nextLine();

			// 아이디와 패스워드 일치여부 확인
			boolean judgeID = (correctId.equals(ID));
			boolean judgePw = (correctPw == pw);
			login = judgeID && judgePw;

			if (judgeID == false) {
				System.out.println("ID가 일치하지 않습니다");
			}
			if (judgePw == false) {
				System.out.println("PW가 일치하지 않습니다");
			}

		} while (!login);
		System.out.println("로그인 성공");

		scanner.close();

	}

	public void practice6() {

		// 변수 선언 및 스캐너 임포트
		String authority = "";
		Scanner scanner = new Scanner(System.in);

		// 사용자의 권한 입력
		System.out.print("권한을 확인하고자 하는 회원 등급 : > ");
		authority = scanner.nextLine();

		// 권한에 따른 기능 출력
		switch (authority) {
		case "관리자":
			System.out.println("회원 관리, 게시글 관리");

		case "회원":
			System.out.println("게시글 작성, 댓글 작성");

		case "비회원":
			System.out.println("게시글 조회");
			break;

		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
		scanner.close();
	}

	public void practice7() {
		// 변수 선언, 스캐너 임포트
		double userHeight = 0.0;
		double userWeight = 0.0;
		Scanner scanner = new Scanner(System.in);
		double BMI = 0.0;

		// 사용자에게 값 입력 받기
		System.out.print("키(m)를 입력해 주세요 : ");
		userHeight = scanner.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		userWeight = scanner.nextDouble();
		scanner.close();

		// 값 계산
		BMI = userWeight / (userHeight * userHeight);
		System.out.println("BMI 지수 : " + BMI);

		// 계산 결과에 따른 값 출력
		if (BMI >= 30) {
			System.out.println("고도 비만");
			return;
		}
		if (BMI >= 25) {
			System.out.println("비만");
			return;
		}
		if (BMI >= 23) {
			System.out.println("과체중");
			return;
		}
		if (BMI >= 18.5) {
			System.out.println("정상체중");
			return;
		}
		System.out.println("저체중");
	}

	public void practice8() {
		// 변수 선언 및 스캐너 임포트
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);

		// 값 입력 받기 및 연산자 확인
		System.out.print("피연산자1 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("피연산자2 입력 : ");
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력(+, -,  *, /, %) : ");
		scanner.nextLine();
		op = scanner.nextLine().charAt(0);

		// 계산 및 출력
		switch (op) {
		case '+':
			result = num1 + num2;

			break;
		case '-':
			result = num1 - num2;

			break;
		case '*':
			result = num1 * num2;

			break;
		case '/':
			result = num1 / num2;

			break;
		case '%':
			result = num1 % num2;

			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}

		System.out.printf("%d %c %d = %d", num1, op, num2, result);

	}

	public void practice9() {
		// 변수 선언 및 스캐너 임포트
		int mScore = 0;
		int fScore = 0;
		int aScore = 0;
		int pScore = 0;
		double total = 0;
		int classNum = 20;
		Scanner scanner = new Scanner(System.in);

		// 사용자 값 입력
		System.out.println("중간 고사 점수 : ");
		mScore = scanner.nextInt();
		System.out.println("기말 고사 점수 : ");
		fScore = scanner.nextInt();
		System.out.println("과제 점수 : ");
		aScore = scanner.nextInt();
		System.out.println("출석 횟수 : ");
		pScore = scanner.nextInt();

		scanner.close();

		// 기준값 계산
		double passClassNum = classNum * 0.7;
		total = mScore * 0.2 + fScore * 0.3 + aScore * 0.3 + pScore;
		System.out.println("============결과==========");

		if ((pScore < passClassNum) || (total < 70)) {
			if (pScore < passClassNum) {
			System.out.printf("FAIL [출석 횟수 부족] (%d/20)\n", pScore);
			}
			if (total < 70) {
			System.out.printf("FAIL [점수 미달] (총점 %.1f)\n", total);
			}
			return;
			
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mScore * 0.2);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fScore * 0.3);
			System.out.printf("과제 점수    (30) : %.1f\n", mScore * 0.3);
			System.out.printf("출석 점수    (20) : %d\n", pScore);
			System.out.printf("총점 : %.1f\n", total);
			System.out.println("pass");
		}
	}

	public void practice10() {
		
		// 스캐너 임포트
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.println("선택 : ");
		num = scanner.nextInt();
		
		switch (num) {
		
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;

		default:
			System.out.println("해당하는 메소드가 존재하지 않습니다.");
			break;
		}
	}
}
