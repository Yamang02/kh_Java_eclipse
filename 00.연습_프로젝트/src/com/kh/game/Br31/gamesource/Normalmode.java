package com.kh.game.Br31.gamesource;

import java.util.Scanner;

import com.kh.game.Br31.BaskinRobins31;

public class Normalmode extends BaskinRobins31 {

	public void GameStart() {
		Scanner scanner = new Scanner(System.in);

		intro();
		System.out.println("노말 모드 게임 시작!");
		System.out.println();

		while (cnt < 31) {
			// 1부터 3까지의 값 입력 받기
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

			// user가 입력한 값 더하기
			for (int i = 1; i <= usercnt; i++) {
				cnt++;
				System.out.println("user : " + cnt);
				sleep(600);
				if (cnt >= 31) {
					result = "ㅠㅠㅠㅠㅠㅠㅠㅠ  컴퓨터 승리! ㅠㅠㅠㅠㅠㅠㅠㅠ ";
					break;
				}
			}
			System.out.println();

			if (27 <= cnt && cnt <= 29) {
				while (cnt <= 29) {
					cnt++;
					System.out.println("com : " + cnt);
					sleep(600);
				}
				System.out.println("com님의 메시지 : GG요~ ^ㅇ^");
				sleep(500);
				continue;
			}
			

			if (cnt < 31) {
				// 컴퓨터 차례
				// 값 (1부터 3까지의 값)
				int rnd = (int) (Math.random() * 3 + 1);
				// 컴퓨터 값 더하기
				for (int i = 1; i <= rnd; i++) {
					cnt++;
					System.out.println("com : " + cnt);
					sleep(600);
					if (cnt >= 31) {
						result = "★☆★☆★☆★☆★ user 승리! ★☆★☆★☆★☆★";
						break;
					}
				}
			}
			
			
		}
		System.err.println(result);
		PrintRestartMessage();
		scanner.close();
	}
	
	public void Restart() {
		this.GameStart();
	}
}
