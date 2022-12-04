package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	/*
	 * 배열
	 * 
	 * 1. 배열의 선언
	 *   [표현법]
	 *     자료형[] 배열명;
	 *     자료형 배열명[]; 
	 * 
	 * 2. 배열의 생성
	 *   [표현법]
	 *    배열명 = new 자료형[배열 크기];
	 *    
	 * 3. 배열의 선언과 생성을 동시에 진행   
	 *   [표현법]
	 *   	자료형[] 배열명 = new 자료형[배열 크기];
	 *   	자료형 배열명[] = new 자료형[배열 크기];
	 *   
	 * 4. 배열의 초기화
	 * 	1) 배열 변수와 인덱스를 이용한 초기화
	 * 		배열명[0] = 값;
	 * 		배열명[1] = 값;
	 * 		...
	 * 
	 * 	2) 선언과 동시에 초기화
	 * 		자료형[] 배열명 = new 자료형[] {값, 값, 값, ... };
	 * 		자료형 배열명[] = new 자료형[] {값, 값, 값, ... };
	 *   	자료형[] 배열명 = {값, 값, 값, ... };
	 * 		자료형 배열명[] = {값, 값, 값, ... };
	 *  
	 *  3) 반복문을 이용한 초기화 	
	 *   
	 */
	public void method1() {
		// 다량의 데이터를 기록하고자 할 때
//		int score1 = 90;
//		int score2 = 80;
//		int score3 = 88;
//		int score4 = 78;
//		int score5 = 97;
		
		int score[] = {90, 80, 88, 78, 97};
		
		
		// 점수 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);	
		}
	
		// 합계 구하기
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}	
				
		System.out.println("합계 :" + sum);
		
		
		
	}

	// 배열의 선언, 생성, 초기화
	public void method2() {
		// 변수 선언
//		int num; // 메모리(Stack)에 정수형 데이터를 담을 수 있는 공간이 할당된다.
		
		// 배열 선언
		int[] iArray1; // 메모리(Stack)에 정수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		int iArray2[]; // 메모리(Stack)에 정수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		double[] dArray1; //  메모리(Stack)에 실수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		double dArray2[]; //  메모리(Stack)에 실수형 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		
		// 배열 생성
//		iArray1 = new int[]; // 배열의 크기를 지정하지 않으면 에러가 발생한다.
		iArray1 = new int[5]; // 메모리(Heap)에 5개의 정수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다.
		iArray2 = new int[10]; // 메모리(Heap)에 10개의 정수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다.
		dArray1 = new double[5]; // 메모리(Heap)에 5개의 실수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다.
		dArray2 = new double[10]; // 메모리(Heap)에 5개의 실수형 데이터를 저장할 수 있는 배열을 생성한다. -> 배열의 주소를 참조 변수에 전달한다.
		
		System.out.println(iArray1);
		System.out.println(iArray2);
		System.out.println(dArray1);
		System.out.println(dArray2);
		
		/*
		 *  배열을 생성하고 초기화해주지 않아도 문제없이 출력이 된다.
		 *  배열은 따로 초기화하지 않는다면, JVM이 지정한 기본 값으로 배열이 초기화된다.
		 *  (정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리항 : false, 참조형 : null)
		 */
		
//		for (int i = 0; i < iArray1.length; i++) {
//			System.out.printf("iArray1[%d] : %d\n", i, iArray1[i]);
//		}
//		
//		for (int i = 0; i < dArray1.length; i++) {
//			System.out.printf("dArray1[%d] : %.1f\n", i, dArray1[i]);
//		}
	
		// 배열을 초기화하는 for문
		for (int i = 0; i < iArray2.length; i++) {
			iArray2[i] = i + 2;
		}
		
		// 배열의 값을 출력하는 for문
		for (int i = 0; i < iArray2.length; i++) {
			System.out.printf("iArray2[%d] : %d\n", i, iArray2[i]);
		}
	}

	public void method3() {
		int iArray[] = new int[5];
		
		iArray[0] = 2;
		iArray[1] = 4;
		iArray[2] = 6;
		iArray[3] = 8;
		iArray[4] = 10;
//		iArray[5] = 12;
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		System.out.println(iArray);
		System.out.println(iArray.length);
		System.out.println(iArray.hashCode());
		System.out.println();
			
//		자바에서 해시 코드는 객체(클래스, 배열)를 식별하는 하나의 정수값을 말한다. 
//		(메소드를 재정의하지 않으면 객체의 주소값(10진수)을 기본적으로 리턴한다.)
		
//		배열에서 한번 지정한 크기는 변경이 불가능하다.
//		따라서 크기를 변경하려면 다시 배열 크기를 지정해서 새로 생성해야 한다.
		iArray = new int[6];
		
		iArray[0] = 2;
		iArray[1] = 4;
		iArray[2] = 6;
		iArray[3] = 8;
		iArray[4] = 10;
		iArray[5] = 12;
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		System.out.println(iArray);
		System.out.println(iArray.length);
		System.out.println(iArray.hashCode());
		
		// 참조 변수는 힙 영역의 객체(클래스, 배열)을 참조하지 않는다는 뜻으로 null값을 가질 수 있다.
		iArray = null;
		System.out.println(iArray);
		
		// null 값을 가지고 있는 참조변수를 사용하려고 하면 에러가 발생한다.
//		System.out.println(iArray.length); // NullPointException
//		System.out.println(iArray.hashCode()); // NullPointException
	}
	// 배열의 선언, 생성, 초기화를 동시에 진행하기
	public void method4() {
		int[] iArray1 = new int[] {1, 2, 3, 4, 5}; // 값의 개수만큼 자동으로 크기가 할당된다.
//		int[] iArray2 = {8, 7, 6, 5, 4, 3, 2}; // new 연산자를 사용하지 않아도 값의 개수만큼 자동으로 크기가 할당된다. 
		int[] iArray2;
//		iArray2 = {8, 7, 6, 5, 4, 3, 2}; // 선언 후 생성할 때는 꼭 new 생성자를 통해 만들어야 한다.	
		iArray2 = new int[] {8, 7, 6, 5, 4, 3, 2};
		
		System.out.println(iArray1.length);
		System.out.println(iArray2.length);
		System.out.println(Arrays.toString(iArray1));
		System.out.println(Arrays.toString(iArray2));
		
		String[] fruitArray = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		// 0번 인덱스부터 4번 인덱스까지 반복으로 사용자에게 문자열을 입력받아 해당 인덱스에 사용자가 입력한 값을 넣는다.
		for (int i = 0; i < fruitArray.length; i++) {
			System.out.printf("%d 번째 과일 입력 > ", i+1);
			fruitArray[i] = scanner.nextLine();
		} 
		
		System.out.println(Arrays.toString(fruitArray));
		scanner.close();
		
	}

	public void practice1() {
		/*
		 * 실습 문제 1
		 * 
		 * 사용자가 입력하는 정수값으로 배열의 길이 
		 * 해당 길이의 배열에 1 ~ 100 의 랜덤값입력
		 * 
		 */
		
		// 변수 선언 및 스캐너
		int len = 0;
		int[] iArray1 = null; // 참조변수도 초기화
		Scanner scanner = new Scanner(System.in);
		
		// 사용자 정수값 입력 및 해당 길이의 배열 생성
		System.out.print("임의의 정수값을 입력하세요. > ");
		len = scanner.nextInt();
		iArray1 = new int[len];
		scanner.close();
		
		// 임의의 정수값 생성 및 배열 대입, 출력
		for (int i = 0; i < iArray1.length; i++) { // len(size) 변수를 사용했을 때 차이점?
			iArray1[i] = (int) (Math.random()*100+1);
			System.out.printf("iArray[%d] : %d\n", i, iArray1[i]);
		}
		
//		System.out.println(Arrays.toString(iArray));
		
	}
	
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자에게 3명의 키를 입력받아 배열에 저장하고 
	 * 반복문을 통해 3명의 키의 총합, 평균값을 구하시오.
	 * 
	 * 예시)
	 * 키 입력 > 180.0
	 * 키 입력 > 177.3
	 * 키 입력 > 168.2
	 * 
	 * 총합 : 525.5
	 * 평균 : 175.2
	 * 
	 */
	public void practice2() {
		
		// 변수 선언, 스캐너, 배열 생성
		int peopleCount = 3;
		double height = 0.0;
		double heightSum = 0.0;
		double[] peopleHeights = new double[peopleCount];
		Scanner scanner = new Scanner(System.in);
		
		// 사용자 값 입력 및 배열 대입
		for (int i = 0 ; i < peopleCount ; i++) {
			System.out.printf("%d번째 사용자의 키 입력(소수점 첫 자리까지) > \n", i+1);
			height = scanner.nextDouble();
			peopleHeights[i] = height;
			heightSum += height;
		}
		
		// 출력
		System.out.printf("총합 : %.1f\n", heightSum);
		System.out.printf("평균 : %.1f\n", heightSum/peopleCount);
		scanner.close();
	}

}

