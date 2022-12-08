package com.kh.game.Br31.gamesource;

import java.util.Scanner;

import com.kh.game.Br31.BaskinRobins31;

public class Balancedmode extends BaskinRobins31 {
	// hellcount 트리거가 6이상 특정값에서 랜덤으로 작동함.

	int random = (int) (Math.random() * 6 + 1);
	// hellcount의 값
	int hellcnt = 2 + 4 * random;
	int warning = hellcnt;

	@Override
	public void GameStart() {
		Scanner scanner = new Scanner(System.in);

		intro();

		while (cnt < 31) {

			if (warning - 7 <= cnt && cnt < warning - 3) {

				System.out.println("================================");
				System.out.println("       곧 컴퓨터가 폭주합니다");
				System.out.println("================================");
			}

			if (warning - 3 <= cnt && cnt < warning) {

				System.err.println("================================");
				System.err.println("    (경고)  컴퓨터가 폭주합니다!");
				System.err.println("================================");
			}

			// 1부터 3까지의 값 입력 받기
			int usercnt = userInput();
			if (escape == true) {
				break;
			}

			// user가 입력한 값 더하기
			for (int i = 1; i <= usercnt; i++) {
				cnt++;
				System.out.println("user : " + cnt);
				sleep(600);
				if (cnt >= 31) {
					result = false;
					break;
				}
			}

			System.out.println();
			if (cnt >= 31) {
				break;
			}

			if (cnt < hellcnt) {
				// 값 (1부터 3까지의 값)
				int rnd = (int) (Math.random() * 3 + 1);
				// 컴퓨터 값 더하기
				for (int i = 1; i <= rnd; i++) {
					cnt++;
					System.out.println("com : " + cnt);
					sleep(600);
					if (cnt >= 31) {
						result = true;
						break;
					}
				}
				System.out.println();
			} else {

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
							result = true;
							sleep(800);
							System.out.println();
							System.out.println("com(hell)님의 메시지 : ...");
							sleep(1000);
							System.out.println("com(hell)님의 메시지 : 헬모드로 오시죠");
							sleep(500);
							break;
						}
					}
				} else {
					// 3) cnt가 hellcnt를 넘어선 경우 - hellcnt에 먼저 4를 더해 기준값을 세우고 com이 hellcnt를 따른다.
					hellcnt += 4;
					while (cnt < hellcnt) {
						cnt++;
						System.err.println("com(hell) : " + cnt);
						sleep(600);
					}
				}

				System.out.println();

				if (cnt == 30) {
					System.out.println();
					sleep(300);
					System.out.println("com(hell)님의 메시지 : 후후...");
					sleep(400);
					System.out.println("com(hell)님의 메시지 : 제가 이겼습니다");
					sleep(400);
					System.out.println();
				}

			}
		}
		if (escape == true) {
			System.out.println("x 입력으로 게임을 종료합니다!");
			return;
		}
		printResult();
	}
}