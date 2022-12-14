package com.kh.sorting;

import com.kh.datastructure.pratice.Heap;

public class Application {

	public static void main(String[] args) {

		Heap heap = new Heap();
		heap.generateArray();
		
		for (int i = 1; i < 7; i++) {
			heap.addNum(i);
		}
		
		heap.printArray();
		heap.printArray();
		System.out.println(heap.popNum());
		
		heap.printArray();
		
	}
}
