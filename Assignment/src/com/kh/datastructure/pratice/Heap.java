package com.kh.datastructure.pratice;

import java.util.ArrayList;

public class Heap {

	public static ArrayList<Integer> list;

	// Array 생성
	public void generateArray() {
		list = new ArrayList<>();
		// 인덱스의 편의를 위해 Array[0]은 사용하지 않음(0을 대입)
		addNum(0);
	}

	// 0번 인덱스를 제외하고 LIST 출력
	public void printArray() {

		System.out.println(list);
	}

	// 숫자를 힙 자료구조에 넣기
	public void addNum(int num) {

		// 리스트의 끝에 숫자를 대입
		int lastIndex = list.size();
		list.add(num);

		// 새로 들어온 값이 더 크면 부모와 위치를 바꿈
		for (int i = lastIndex; i > 1; i /= 2) {
			if (list.get(i) > list.get(i / 2)) {
				swap(i, i / 2);
			} else {
				break;
			}
		}
	}


	// list내 요소의 위치를 서로 바꾸는 메소드
	public void swap(int index1, int index2) {
		int num = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, num);
	}

	// 자식 노드 중 더 큰 쪽의 인덱스를 반환하는 메소드
	public int comparingChilds() {
		int biggerChildIndex;
		
		
		return biggerChildIndex;
	}
	
}
