package com.kh.datastructure.pratice;

import java.util.ArrayList;

public class Heap {

	public static ArrayList<Integer> list;
	public static int bigNum;

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

	// list 내 자식 노드 값을 비교하여 더 큰 값의 인덱스를 반환하는 메소드
	public int BiggerChildIndex(int li, int ri) {
		int leftChildIndex;
		int rightChildIndex;
		int biggerIndex;

		leftChildIndex = li;
		rightChildIndex = ri;

		if (list.get(leftChildIndex) > list.get(rightChildIndex)) {
			biggerIndex = leftChildIndex;
		} else {
			biggerIndex = rightChildIndex;
		}
		return biggerIndex;
	}

	public int popNum() {
		// 1번 인덱스를 꺼냄
		bigNum = list.get(1);

		// 가장 마지막 인덱스와 1번을 교체함(이후 마지막 인덱스 값을 지움)
		swap(list.size() - 1, 1);
		list.remove(list.size() - 1);

		// 새로운 마지막 인덱스 값
		int lastIndex = list.size() - 1;
		int parentIndex = 1;
		int childIndex;
		// 1부터 자식 노드들을 비교
		for (int i = parentIndex; i < lastIndex;) {

			// 왼쪽 노드와 오른쪽 노드의 인덱스값
			int leftChildIndex = i * 2;
			int rightChildIndex = i * 2 + 1;

			
			
		}
		return bigNum;
	}
}
