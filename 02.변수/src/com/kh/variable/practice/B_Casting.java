package com.kh.variable.practice;

import java.util.ArrayList;
import java.util.List;

public class B_Casting {
	/* 
	 * 형 변환
	 * 
	 * 	* 컴퓨터에서 값의 처리 규칙
	 * 	 1) 대입 연산자를 사용할 때 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다.
	 *   2)같은 자료형의 데이터끼리 연산이 가능하다. (연산 결과도 같은 자료형으로 나온다. )
	 * 
	 * * 형 변환의 종류
	 * 		1) 자동 형 변환(묵시적 형 변환)
	 
	 *		- 자동으로 형 변환이 이루어짐. 개발자가 형 변환을 시켜줄 필요가 없다.
	 *	 	- 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 *
	 * 		2) 강제 형 변환(명시적 형 변환)
	 *		  [표현법]
	 *			(자료형) 데이터;
	 *
	 *		- 범위가 큰 크기의 자료형의 데이터를 작은 크기의 자료형으로 변환하려고 할 때 사용한다.
	 *		- (자료형)을 형 변환 연산자라고 한다.
	 *		- 강제 형 변환의 경우 데이터의 손실이 발생할 수 있다.
	 *
	 */	
	
	public void autoCasting() {
		byte b = 10;
		short s = 12;
		int i = s; // short > int 자동 형 변환된다.
		long l = i; // int > long 자동 형 변환된다.
		double d = l; // long > double 자동 형 변환된다.
		float f = 100000000000L;// float이 long보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능하다.
		
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		
		double result = 12 + 3.3; // 12.0 + 3.3 = 15.3
//		short result2 = b + s; // byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리한다.
		int result2 = b + s;
		long result3 = 30 + 30; // 30 + 30 = 60, 60을 long 타입으로 형 변환 후 대입(60L)
		long result4 = 30 + 30L; // 30L + 30L
		System.out.println("result : " + result);		
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
		
		
	}
	
	public void casting() {
		double d = 4.123345678904568;
		float f = (float) d;
		int i = (int)f;
				
		
		System.out.println("d : "+ d);
		System.out.println("f : "+ f);
		System.out.println("i : "+ i);
	
//		int sum = (int)(i + d);
		int sum = i + (int)d;
		
		System.out.println("sum : " + sum);

		
		// 데이터 손실 테스트
		int number = 290;
		byte bNum = (byte) number;
		
		System.out.println("number : " + number);
		System.out.println("bNum : " + bNum);
		
				
//		System.out.println("Int의 최대값 : " + Integer.MAX_VALUE + ", 최소값 : " + Integer.MIN_VALUE);
//	    System.out.println("Long의 최대값 : " + Long.MAX_VALUE + ", 최소값 : " + Long.MIN_VALUE);
//	    System.out.println("Double의 최대값 : " + Double.MAX_VALUE + ", 최소값 : " + Double.MIN_VALUE);
//	    System.out.println("Float의 최대값 : " + Float.MAX_VALUE + ", 최소값 : " + Float.MIN_VALUE);
//		
		/*
		 * 실습문제 1.
		 * 영화관의 요금 표는 다음과 같습니다.
		 *  - 성인 : 10000원
		 *  - 청소년 : 7000원
		 *  성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
		 *  
		 *  예시) 
		 *  성인 2명 : 20000원
		 *  청소년 3명 : 21000원
		 *  
		 *  총 금액 : 41000원
		 *  
		 * 
		 * 
		 */
			
		}
		
		public void practice1() {
			// 1. 변수 준비
			int adultNum;
			int childNum;
			int adultFee;
			int childFee;
			int total;
		
			adultNum = 2;
			childNum = 3;
			adultFee = 10000;
			childFee = 7000;
			total = (adultNum * adultFee) + (childNum * childFee);
			
			System.out.println("성인 "+ adultNum + "명 :" + adultNum*adultFee + "원");
			System.out.println("청소년 "+ childNum + "명 :" + childNum*childFee + "원");
			System.out.println();
			System.out.println("총 금액 : " + total + "원");
			
	}
		
		/*
		 * 실습문제 2.
		 * 문인수는 국어 점수 60점 / 영어 점수 70점 / 수학 점수 66점을 받았다.
		 * 문인수의 총점과 평균을 출력하세요.
		 * 
		 * 예시)
		 * 국어 점수 : 60점
		 * 영어 점수 : 70점
		 * 수학 점수 : 66점
		 * 
		 * 총점 : 196점
		 * 평균 : 65.33점
		 *
		 */
		
		public void practice2() {
			
			int koreanScore = 60;
			int englishScore = 70;
			int mathScore = 66;
			
//			ArrayList<String> subject = new ArrayList<String>();
			
			
			
			int total = koreanScore + englishScore + mathScore;
			double average = (double) total/3;
//			double average = total / 3.0 ;
//			
			
			System.out.println("국어 점수 : " + koreanScore + "점");
			System.out.println("영어 점수 : " + englishScore + "점");
			System.out.println("수학 점수 : " + mathScore + "점");
			System.out.println();			
			System.out.println("총점 : " + total + "점");
			System.out.printf("평균 : %.2f 점\n", average);
					
			
		}
		
	
}
