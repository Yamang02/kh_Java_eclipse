package com.kh.first;

import com.kh.first.practice.ValuePrinter;
// ctrl + shift + O = 임포트 정리(생성 or 제거)

public class Application {
/*	주석(Comment) */
// 	클래스명은 클래스 파일명과 동일해야 한다.
// 	클래스 안에는 여러 개의 메소드를 가질 수 있다.
	
// 	main 메소드는 프로그램의 시작점으로 java.exe가 Application.class를 실행시킬 때 제일 먼저 실행되는 메소드이다.
	public static void main(String[] args) {

// 	1) 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
// 	[표현법] 
//   	클래스명 사용할 이름 = new 클래스명();
	   
// 	방법 1) import문을 사용하지 않고 클래스 생성(패키지를 포함하여 클래스) 
//		com.kh.first.practice.ValuePrinter printer = new com.kh.first.practice.ValuePrinter();

		
//	방법 2) import문을 사용하여 클래스 생성
		ValuePrinter printer = new ValuePrinter();
		
// 	2) 생성한 클래스 메소드 실행(호출)
//	[표현법]
//		사용할 이름. 실행할 메소드명();
		printer.print(); 		
	}

}
