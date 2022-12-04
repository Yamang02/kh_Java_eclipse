package com.kh.game.Br31.gamesource;

import java.util.Scanner;

import com.kh.game.Br31.BaskinRobins31;

public class Hellmode extends BaskinRobins31 {

	int hellcnt = 2;
	/*
	 * hellcnt 설명 : 30을 말하면 이기는 게임 - user 와 com 의 값의 합은 최소4이다. 따라서 26을 말하는 사람은 반드시
	 * 이길 수 있다. 해당 과정을 반복하면 30 - 4*7 = 2, 2를 말하는 사람이 반드시 이길 수 있는 공식이 존재한다.
	 * 
	 */

	public void GameStart() {
		Scanner scanner = new Scanner(System.in);

		// 본 게임
		intro();
		System.err.println("헬모드 게임 시작!");
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

			if (cnt < 31) {
				// 3가지 경우
				if (cnt < hellcnt) {
					// 1) cnt가 hellcnt보다 작은 경우 - com이 hellcnt까지 말하고 다음 4를 더하여 다음 hellcnt값을 정한다.
					while (cnt < hellcnt) {
						cnt++;
						System.err.println("com(hell) : " + cnt);
						sleep(600);
					}
					hellcnt += 4;

				} else if (cnt == hellcnt) {
					// 2) user가 hellcnt를 따라가고 있는 경우 - com은 1~3의 랜덤값을 말한다.
					hellcnt += 4;
					int rnd = (int) (Math.random() * 3 + 1);
					for (int i = 1; i <= rnd; i++) {
						cnt++;
						System.err.println("com(hell) : " + cnt);
						sleep(600);
						if (cnt >= 31) {
							result = "★☆★☆★☆★☆★ user 승리! ★☆★☆★☆★☆★";
							sleep(800);
							System.out.println();
							System.out.println("com(hell)님의 메시지 : 이럴수가...");
							sleep(1000);
							System.out.println("com(hell)님의 메시지 : 제가 졌습니다ㅠㅠ");
							sleep(500);
							System.out.println();
							break;
						}
					}
				} else {
					// 3) cnt가 hellcnt를 넘어선 경우 - hellcnt에 먼저 4를 더해 기준값을 세우고 com이 hellcnt를 따른다.
					hellcnt += 4;
					while (cnt < hellcnt) {
						cnt++;
						System.err.println("com : " + cnt);
						sleep(600);
					}
				}
				if (cnt == 30) {
					System.out.println();
					sleep(300);
					System.out.println("com(hell)님의 메시지 : 후후...");
					sleep(400);
					System.out.println("com(hell)님의 메시지 : 헬모드를 너무 쉽게 보셨군요?");
					sleep(400);
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
