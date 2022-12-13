package com.kh.sorting;

import com.kh.datastructure.pratice.Heap;

public class Application {

	public static void main(String[] args) {

		Heap heap = new Heap();
		heap.generateArray();

		for (int i = 0; i < 5; i++) {
			heap.addNum(i);
		}
		
		System.out.println(heap.popNum());
		heap.printArray();
		
		
	}
}
