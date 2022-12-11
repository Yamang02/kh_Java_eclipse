package com.kh.datastructure;

import com.kh.datastructure.Practice.HeapStruc;

public class Application {

	public static void main(String[] args) {

		HeapStruc heapStruc = new HeapStruc();

		for (int i = 0; i < 9; i++) {
			heapStruc.addNum(i);
		}

		System.out.println(heapStruc.list);
		
		System.out.println(heapStruc.delNum());

		System.out.println(heapStruc.list);

	}
}
