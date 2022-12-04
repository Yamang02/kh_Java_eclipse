package com.kh.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자
	 *   [표현법]
	 *   	조건식 ? 식1 : 식2;
	 *   
	 *   - 조건식에는 주로 비교, 논리 연산자가 사용
	 *   - 조건식의 결과가 true이면 식1을 수행한다.
	 *   - 조건식의 결과가 false이면 식2를 수행한다.
	 */
	public void method1() {

		// 입력받은 정수가 양수인지 음수인지 판단
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("임의의 정수를 입력하세요 > " );
		num = scanner.nextInt();
		
		result = (num == 0) ? "0" : (num > 0) ? "양수" : "음수";
		
		System.out.printf("%d(은/는) %s이다.",num, result);
			
		
		scanner.close();
		
		
	}
	
	
}
