package com.kh.sorting;

import com.kh.datastructure.pratice.Maxheap;

public class Application {

	public static void main(String[] args) {

		Maxheap mheap = new Maxheap();
		mheap.generateArray();
		
		for (int i = 1; i < 6; i++) {
			mheap.addNum(i);
		}
		
		mheap.printArray();
		System.out.println(mheap.popNum());
		
		mheap.printArray();
		
	}
}
