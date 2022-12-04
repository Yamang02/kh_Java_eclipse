package com.kh.operator.practice;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		
		int num = 0;
		boolean result1 = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("무작위의 정수를 입력해주세요.");
		num = scanner.nextInt();
		result1 = ((num >= 1) && (num <= 100));
	
		System.out.printf("%d(은/는) 1 이상 100 이하의 값인가요? %b", num, result1);
		
		
		scanner.close();
		
		
	}

	public void method2() {
		// Short Cut Evaluation
		int num = 10;
		boolean result = false;
		
//		&& 연산자를 기준으로 앞에서 이미 false 가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (num < 5) && (++num > 0);
		
		System.out.println(result);
		System.out.println(num); // 10
		
//		|| 연산자를 기준으로 앞에서 이미 true 가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (num < 20) || (++num >0);
		
		System.out.println(result);
		System.out.println(num); // 10
		
		
	}

		
}
	
