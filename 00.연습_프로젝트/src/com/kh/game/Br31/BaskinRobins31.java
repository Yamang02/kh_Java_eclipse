package com.kh.game.Br31;

import java.util.Scanner;

import com.kh.game.Br31.gamesource.Balancedmode;
import com.kh.game.Br31.gamesource.Hellmode;
import com.kh.game.Br31.gamesource.Normalmode;

public abstract class BaskinRobins31 {

	// 필드
	public static int userDifficulty = 0; // 사용자 정의 난이도
	public static boolean restart = false; // 재실행여부
	public static boolean escape = false; // 탈출키
	public static boolean result = false; // 사용자승패여부

	public int cnt = 0; // 31까지 도달할 count
	public String user = ""; // 유저 입력값(space를 숫자로 전환);
	
	Scanner scanner = new Scanner(System.in);

	// 메소드
	// 메뉴 출력
	public static void printMenu() {

		System.out.println("1, 2, 3 중 난이도를 골라주세요");
		System.out.println("게임 중 x를 입력하면 메뉴로 돌아갑니다!");
		System.out.println("========= <   메   뉴  >=======");
		System.out.println("1. 노말모드 - 어렵지 않은 난이도입니다 ");
		System.out.println("2. 밸런스모드 - 임의의 값에서 컴퓨터가 폭주합니다 ");
		System.out.println("3. 헬모드 - 단 한번의 실수도 용납되지 않습니다 ");
		System.out.println("기타 숫자. 프로그램 종료");
		System.out.println("===============================");
		System.out.println("숫자 입력    >  ");

	}

	// 난이도별 게임 선택
	public static void chooseDifficulty() {
		switch (userDifficulty) {
		case 1:
			new Normalmode().GameStart();
			break;
		case 2:
			new Balancedmode().GameStart();
			break;
		case 3:
			new Hellmode().GameStart();
			break;
		default:
			escape = true;
			return;
		}
	}

	// 난이도별로 게임 시작
	public abstract void GameStart();

	// 게임 인트로
	public void intro() {
		System.out.println("베스킨~ 라빈스~");
		sleep(600);
		System.err.println("31~");
		sleep(600);
		System.out.println("귀엽고~ 깜찍하게~");
		sleep(600);
		System.err.println("31~");
		sleep(600);
		System.out.printf("%s모드 게임 시작!\n", (userDifficulty == 1)? "노말" : (userDifficulty == 2)? "밸런스" : "헬");
		System.out.println();
	}

	// 유저 입력값 받기 / 전환 / 탈출
	public int userInput() {
		int usercnt = 0;

		do {
			System.err.println("전달할 값만큼 space바를 입력하세요!!");
			user = scanner.nextLine();
			if (" ".equals(user)) {
				usercnt = 1;
			} else if ("  ".equals(user)) {
				usercnt = 2;
			} else if ("   ".equals(user)) {
				usercnt = 3;
			} else {
				usercnt = 0;
				if (user.equals("x")) {
					escape = true;
					break;
				}
				System.out.println("값을 다시 입력해주세요.");
			}
		} while (!(1 <= usercnt && usercnt <= 3));

		return usercnt;
	}

	// 결과 출력
	public void printResult() {
		if (result == true) {
			System.err.println("★☆★☆★☆★☆★ user 승리! ★☆★☆★☆★☆★");
		} else {
			System.err.println("ㅠㅠㅠㅠㅠㅠㅠ computer 승리! ㅠㅠㅠㅠㅠㅠ");
		}
		sleep(1000);
		System.out.println();
	}
	
	// 시간 지연
	public void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
