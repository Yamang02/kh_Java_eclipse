package com.kh.game.Br31;

import java.util.Scanner;

import com.kh.game.Br31.gamesource.Balancedmode;
import com.kh.game.Br31.gamesource.Hellmode;
import com.kh.game.Br31.gamesource.Normalmode;

public abstract class BaskinRobins31 {

	public int cnt = 0;
	public String user = "";
	public String result = "";
	public int choose = 0;
	public static int userdifficulty = 0;

	Scanner scanner = new Scanner(System.in);

	public abstract void GameStart();

	public static void printMenu() {
		
		System.out.println("1, 2, 3 중 난이도를 골라주세요");
		System.out.println("1. 노말모드 - 어렵지 않은 난이도입니다 ");
		System.out.println("2. 밸런스모드 - 임의의 값에서 컴퓨터가 폭주합니다 ");
		System.out.println("3. 헬모드 - 단 한번의 실수도 용납되지 않습니다 ");
		System.out.println("4. 프로그램 종료");
		System.out.println("숫자 입력    >  ");
		
	}
	
	public void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void intro() {
		System.out.println("베스킨~ 라빈스~");
		sleep(600);
		System.err.println("31~");
		sleep(600);
		System.out.println("귀엽고~ 깜찍하게~");
		sleep(600);
		System.err.println("31~");
		sleep(600);
	}

	public void PrintRestartMessage() {
		System.out.println("게임을 다시 시작하시겠습니까? Y / N 입력");

		try {

			char re = scanner.nextLine().charAt(0);

			if (re == 'Y' | re == 'y') {

			} else {
				return;
			}
		} catch (Exception e) {
			System.out.println("잘못된 값을 입력하여 메뉴로 돌아갑니다.");
			return;

		}

	}

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
				System.out.println("값을 다시 입력해주세요.");
				System.out.println();
			}
		} while (!(1 <= usercnt && usercnt <= 3));

		return usercnt;

	}

	public static void chooseDifficulty() {
		switch (userdifficulty) {
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
			return;
		}
	}

}
