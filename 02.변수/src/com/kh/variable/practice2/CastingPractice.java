package com.kh.variable.practice2;

import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class CastingPractice {

	public static void method1() {
		
		/* 키보드로 문자 하나를 입력 받아 그 문자와 문자의 유니코드 값을 출력하시오.
		 * 
		 */
		
	char ch;
	String line;
	
	System.out.println("임의의 문자를 입력하세요");
	Scanner scanner = new Scanner(System.in);
	line = scanner.nextLine();
	ch =  line.charAt(0);	
	int uni = ch; 
	
	System.out.printf("%c Unicode : %d", ch, uni);
	
	scanner.close();
		
	}
	
	
	
	
}
