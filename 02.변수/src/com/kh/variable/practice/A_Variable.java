package com.kh.variable.practice;

public class A_Variable {
	public void printValue() {
		// 변수를 사용하지 않으면
		System.out.println(10 * 2 * 3.141592); // 원의 둘레
		System.out.println(10 * 10 * 3.141592); // 원의 넓이
		// 값들의 의미를 알 수 없고, 수정할 시 각각의 값을 바꿔야 하며, 코드 작성 시간도 길어진다.
		
		// 변수를 사용하면
		int r = 10;
		int h = 20;
		double pi = 3.141592;
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);
		System.out.println(r * r * h * pi);
		
	}
	public void variableTest() {
		/*
		 * 변수의 선언
		 *   [표현법]
		 *   	자료형 변수명;
		 *   
		 *   	- 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당받을지에 대한 정보이다.
		 *   	- 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
		 *   
		 * 변수의 초기화
		 *   [표현법]
		 *   	변수명 = 값; 
		 *   
		 */
		
//		논리형
		boolean isTrue; // 1byte의 논리값을 담을 수 있는 변수 선언.
		
//		문자형
//		char ch = 'a'; // 2byte의 문자(혹은 유니코드값)를 담을 수 있는 변수 선언.
//		char ch = -90; // 유니코드는 0부터 시작
		char ch = 90;
		
		
//		정수형
		byte bNum; // 1byte의 정수를 담을 수 있는 변수 선언.
		short sNum; // 2byte의 정수를 담을 수 있는 변수 선언.
		int iNum; // 4byte의 정수를 담을 수 있는 변수 선언.
		long lnum; // 8byte의 정수를 담을 수 있는 변수 선언.
		
//		실수형
		float fNum; // 4byte의 실수를 담을 수 있는 변수 선언.
		double dNum; // 8byte의 실수를 담을 수 있는 변수 선언.
		
//		문자열
//		String name = "이정준"; // 문자열을 가리킬 수 있는 참조형 변수를 선언한다.
		String name = new String("이정준"); // String은 Class이므로 new 생성자로 만드는 것도 가능하다.
		
		
//		지역 변수를 생성 후 초기화가 되지 않은 경우 사용하려고 하면 에러가 발생한다.
		isTrue = false;
//		isTrue =1; // 에러 발생
		System.out.println("isTrue : " + isTrue);
		
		bNum = 11;
//		bNum = 128; 에러 발생
		sNum = 12;
//		sNum = 120000;
		iNum = 300;
//		정수형 리터럴은 기본적으로 int로 컴파일 된다.
//		long 타입 리터럴은 숫자 뒤 대문자 L 혹은 소문자 l을 입력해야 한
		lnum = 1000000000000000000L;
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lnum);

//		실수는 기본적으로 double 타입으로 저장하기 때문에 float타입은 대문자 f 혹은 소문자 f를 입력해야 한다.
		fNum = 3.14F;
		dNum = 12.34567;
		
		System.out.println(fNum);
		System.out.println(dNum);

		System.out.println("ch : " + ch);
		System.out.println(name);
		
//		변수 명명 규칙
//		1) 대소문자 구분 (자료형이 달라도 변수명이 같으면 에러 발생)
		int number;
		int Number;
		
//		2) 숫자로 시작하면 안 된다.
		int a2g3e4;
//		String 34age;
		
//		3) 특수문자는 _와 $만 사용가능, 앞에 사용도 가능
		int _age;
		int a_g_e;
		int age$;
//		int %age;
		
//		4) 예약어를 사용하면 안 된다.
//		int public;
//		int void;

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void constant() {
		/*
		 * 상수
		 *   [표현법]
		 *   	final 자료형 변수명;
		 *   	
		 *   	- 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 *   	- 초기화 이후에는 값을 변경할 수 없다.
		 *   
		*/
		
		int age;
		final int AGE;
		
		age = 20;
		AGE = 30;
		
		age = 25;
//		AGE = 35; // 에러발생
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		
	}
	
	
	
}
