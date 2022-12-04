package com.kh.game;

import java.util.Scanner;

import com.kh.game.Br31.gamesource.Balancedmode;
import com.kh.game.Br31.gamesource.Hellmode;
import com.kh.game.Br31.gamesource.Normalmode;

public class Application {

	public static void main(String[] args) {
		// 사용자에게 난이도 입력 받기 
		Scanner scanner = new Scanner(System.in);
		int user = 0;
		
		System.out.println("1, 2, 3 중 난이도를 골라주세요");
		System.out.println("1. 노말모드 - 어렵지 않은 난이도입니다 ");
		System.out.println("2. 밸런스모드 - 임의의 값에서 컴퓨터가 폭주합니다 ");
		System.out.println("3. 헬모드 - 단 한번의 실수도 용납되지 않습니다 ");
		System.out.println("4. 프로그램 종료");
		System.out.println("숫자 입력    >  ");
		
		user = scanner.nextInt();
		chooseDifficulty(user);
		
		scanner.close();

		return;
	}
	
	public static void chooseDifficulty (int i) {
		switch (i) {
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
