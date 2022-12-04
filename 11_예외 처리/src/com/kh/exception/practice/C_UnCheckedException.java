package com.kh.exception.practice;

import java.util.Scanner;

public class C_UnCheckedException {

	/*
	 * 
	 * UnChecedException - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는 예외를 말한다. - 
	 * RuntimeException 클래스를 상속하고 있는 예외를 UnCheckedException이라 한다. - 프로그램 실행할 때 문제가 발생되는 것으로 충분히 예측이
	 * 가능하기 때문에 조건문들을 통해서 처리가 가능하다.
	 * 
	 * 
	 * RuntimeException의 후손들 - NullpointerException - ClassCastException -
	 * ArithmeticException - ArrayIndexOutOfBoundsException -
	 * NegaticeArraysSizeException
	 * 
	 */

	public void method1() {
		// ArithmeticException
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수1 > ");
		num1 = scanner.nextInt();

		System.out.println("정수2 > ");
		num2 = scanner.nextInt();

		/*
		 * if(num2 == 0) { System.out.println("0으로는 나눌 수 없습니다"); scanner.close();
		 * 
		 * return; }
		 */

		try {

			result = num1 / num2;

			System.out.println("result : " + result);

		} catch (ArithmeticException e) {

			System.out.println("0으로는 나눌 수 없습니다");

		} finally {
			scanner.close();
		}

	}

	public void method2() {

		Scanner scanner = new Scanner(System.in);
		int size = 0;
		int[] array = null;

		System.out.print("생성하실 배열의 길이를 입력하세요");

//		if (size <= 0 ) {
//			System.out.println("양수를 입력해 주세요.");
//			scanner.close();
//			
//			return;
//		}

		try {
			size = scanner.nextInt();
			array = new int[size];

			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);

			}
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {

			System.out.println("잘못된 배열의 길이를 입력하셨거나 잘못된 인덱스에 접근하셨습니다. 양수를 입력해 주세요.");
			
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다. 관리자에게 문의해주세요.");
		}
		finally {
			scanner.close();
		}

	}

}
