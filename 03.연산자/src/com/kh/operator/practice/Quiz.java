package com.kh.operator.practice;

import java.util.Scanner;

public class Quiz {
	
	/*
	 * 실습 문제
	 * 
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ 'Z' 까지가 코드값으로 65 ~90까지의 숫자로 나열되어 있다.
	 *
	 */
	

	public void practice() {
		
		char ch = 0;
		boolean result = false;
		
		
		System.out.println("임의의 알파벳 한글자를 입력하세요");
		Scanner scanner = new Scanner(System.in);	
		String line = scanner.nextLine();
		ch =  line.charAt(0);		
		result = (ch >= 65) && (ch <= 90);
		
		System.out.printf("%c는 대문자 입니까? %b", ch, result);
		
		scanner.close();
	}
	
	public static void practice4() {
		
		// 변수 선언
		int peopleCount = 1;
		int candyCount = 1;
		int candyPerPerson = candyCount / peopleCount;
		int candyLeft = candyCount % peopleCount;
		
		// 인원수, 개수 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("사탕을 받을 인원을 입력하세요. > ");
		peopleCount = scanner.nextInt();
		System.out.println("사탕 개수를 입력하세요. > ");
		candyCount = scanner.nextInt();
		scanner.close();
		
		// 계산 및 출력
		System.out.printf("인원 수 : %d\n", peopleCount);
		System.out.printf("사탕 개수 : %d\n\n", candyCount);
		System.out.printf("1인당 사탕 개수 : %d\n", candyPerPerson);
		System.out.printf("남는 사탕 개수 : %d\n\n", candyLeft);
				
		scanner.close();
		
	}
				

}
