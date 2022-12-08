package com.kh.game;

import java.util.Scanner;

import com.kh.game.Br31.userdata.UserDataManage;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다.");
		Scanner scanner = new Scanner(System.in);

		
		UserDataManage.logIn();
//		UserDataManage.gameCount();
		
//		BaskinRobins31.Startmenu(); 
		
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
