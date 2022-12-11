package com.kh.datastructure.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapStructure {
	public static int heapSize = 10;
	public static List<Integer> maxHeap = new ArrayList<Integer>(heapSize);

	// 최대 힙 삽입
	public void insert_max_heap(int x) {

		maxHeap.add(x); // 힙 크기를 하나 증가하고, 마지막 노드에 x를 넣음
		++heapSize;
		
		int Last_node_i = heapSize - 1; 
		int Parent_i = Last_node_i/2;
		
		for (int i = Last_node_i; i > 1; i /= 2) {

			// 마지막 노드가 자신의 부모 노드보다 크면 swap
			if (maxHeap.get(Parent_i) < maxHeap.get(Last_node_i)) {
				swap(Parent_i, Last_node_i);
			} else {
				break;
			}
		}
	}

	// 최대 힙 삭제
	public int delete_max_heap() {

		if (heapSize == 0) // 배열이 비어있으면 리턴
			return 0;

		int item = maxHeap.get(1); // 루트 노드의 값을 저장
		maxHeap.add(1, maxHeap.get(heapSize)); // 마지막 노드 값을 루트로 이동
		maxHeap.add(heapSize, 0); // 힙 크기를 하나 줄이고 마지막 노드 0 초기화

		for (int i = 1; i * 2 <= heapSize;) {

			// 마지막 노드가 왼쪽 노드와 오른쪽 노드보다 크면 끝
			if (maxHeap.get(i) > maxHeap.get(i*2) && maxHeap.get(i) > maxHeap.get(i*2+1)) {
				break;
			}
			// 왼쪽 노드가 더 큰 경우, swap
			else if (maxHeap.get(i*2) > maxHeap.get(i*2+1)) {
				swap(i, i * 2);
				i = i * 2;
			}
			// 오른쪽 노드가 더 큰 경우, swap
			else {
				swap(i, i * 2 + 1);
				i = i * 2 + 1;
			}
		}

		return item;
	}

	public void swap(int i, int j) {
		int swap_i = maxHeap.get(i);

		maxHeap.add(i, maxHeap.get(j));
		maxHeap.add(j, swap_i);
	}
}