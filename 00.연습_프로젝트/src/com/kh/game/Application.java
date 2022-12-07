package com.kh.game;

import java.util.Scanner;

import com.kh.game.Br31.BaskinRobins31;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BaskinRobins31.printMenu();
		BaskinRobins31.userdifficulty = scanner.nextInt();
		BaskinRobins31.chooseDifficulty();
		
		
		scanner.close();

		return;
	}
	

}
