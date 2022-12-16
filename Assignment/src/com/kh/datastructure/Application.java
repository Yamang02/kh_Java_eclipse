package com.kh.datastructure;

import com.kh.datastructure.pratice.Minheap;
import com.kh.datastructure.pratice.Minheapzb;

public class Application {

	public static void main(String[] args) {

//		// maxHeap
//		Maxheap maxheap = new Maxheap();
//		maxheap.generateArray();
//
//		for (int i = 1; i < 6; i++) {
//			maxheap.addNum(i);
//		}
//
//		maxheap.printArray();
//		System.out.println(maxheap.popNum());
//
//		maxheap.printArray();
//
		// minHeap
//		Minheap minheap = new Minheap();
//		minheap.generateArray();
//
//		for (int i = 0; i < 10; i++) {
//			int rnd = (int) (Math.random() * 100 + 1);
//			minheap.addNum(rnd);
//		}
//
//		minheap.printArray();
//		System.out.println(minheap.popNum());
//
//		minheap.printArray();

		// maxHeapzb
//		Maxheapzb maxzb = new Maxheapzb();
//		maxzb.generateArray();
//
//		for (int i = 0; i < 10; i++) {
//			int rnd = (int) (Math.random()*100+1);
//			maxzb.addNum(rnd);
//		}
//
//		maxzb.printArray();
//		System.out.println(maxzb.popNum());
//		maxzb.printArray();

		// minHeapzb
		Minheapzb minheapzb = new Minheapzb();
		minheapzb.generateArray();

		for (int i = 0; i < 10; i++) {
			int rnd = (int) (Math.random() * 100 + 1);
			minheapzb.addNum(rnd);
		}
		minheapzb.printArray();
		System.out.println(minheapzb.popNum());

		minheapzb.printArray();

	}
}
