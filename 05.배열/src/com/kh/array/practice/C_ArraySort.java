package com.kh.array.practice;

import java.util.Arrays;
import java.util.Collections;

public class C_ArraySort {

	public void method1() {
		int[] array = { 2, 7, 5, 1, 3 };

		System.out.println(Arrays.toString(array));

		// 1. 오름차순으로 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// 2. 내림차순으로 정렬
		// 1) 원본 배열을 오름차순으로 정렬 후 새로운 배열에 대입
		int[] copy = new int[5];

		for (int i = 0; i < array.length; i++) {
			copy[array.length - i - 1] = array[i];
		}

		System.out.println(Arrays.toString(copy));

		// 2) 참조형 자료형을 활용
		Integer integer = new Integer(3);
		Integer[] integerArray = { 2, 7, 5, 1, 3 };

		Arrays.sort(integerArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(integerArray));
	}

	public void method2() {

		String[] array = { "메론", "Orange", "Apeach", "bannna", "apple", "레몬" };

		System.out.println(Arrays.toString(array));

		// 오름차순 정렬
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// 내림차순 정렬
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));
	}

	/*
	 * 조별 과제 
	 *    
	 *    정렬 알고리즘 정리
	 *    
	 *    1. 개별로 정렬 알고리즘을 하나씩 선택해서 정리해 주세요.
	 *    
	 *    2. 시간 복잡도/ 공간 복잡도 정리 (각자);
	 *    
	 * 	  3. 반드시 정리된 내용은 조원들끼리 공유 및 코드 리뷰를 진행해 주세요.   
	 *    
	 *    4. 12월 03일 토요일까지 내용을 정리 후 메일로 보내주세요.
	 *    
	 *     주리 :  퀵
	 *     현아 :  쉘
	 *     정준 :  병합
	 *     승우 :  버블
	 *     승원 :  삽입
	 *     정환 :  선택
	 *    
	 */
	
	
}
