package com.kh.game;

import java.util.Scanner;

import com.kh.game.Br31.BaskinRobins31;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (BaskinRobins31.escape == false) {
			BaskinRobins31.printMenu();
			try {
				BaskinRobins31.userDifficulty = scanner.nextInt();
			} catch (Exception e) {
				System.err.println("오류가 감지되었습니다.");
				break;
			}
			BaskinRobins31.chooseDifficulty();
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
