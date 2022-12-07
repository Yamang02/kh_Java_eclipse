package com.kh.chapter4.generics;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics<T extends Number> {

	private final T[] values;
	// 생성할 시 단 한번의 초기화 가능;

	public MyGenerics(T[] values) {
		this.values = values;
	}

	public void print() {
		for (T t: values) {
			System.out.println(t);
		}
	}
	
	public List<T> toList() {
		
		List<T> list = new ArrayList<>();
		
		for (T t : values) {
			list.add(t);

		}
		return list;
	}
	
//	public <R extends Number>R sum(R[] array) {
//		R result;
//			
//		// 인스턴스 간의 합을 구현할 방법?
//		
//		
//		return result;
//	}
	
	

}
