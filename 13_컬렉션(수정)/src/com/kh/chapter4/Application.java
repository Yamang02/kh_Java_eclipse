package com.kh.chapter4;

import java.util.List;

import com.kh.chapter4.generics.MyGenerics;

public class Application {

	public static void main(String[] args) {

		String[] sarray = {"문인수", "이정준", "이정환", "정주리", "김세희"};
		Integer[] iarray = {11, 22, 33, 44, 55};
		Double[] darray = {11.1, 22.2, 33.3, 44.4, 55.5};
		
//		MyGenerics<String> generics1 = new MyGenerics<>(sarray);
		MyGenerics<Integer> generics2 = new MyGenerics<>(iarray);
		MyGenerics<Double> generics3 = new MyGenerics<>(darray);
		
//		generics1.print();
		generics2.print();
		generics3.print();
		
//		List<String> list1 = generics1.toList();
		List<Integer> list2 = generics2.toList();
		List<Double> list3 = generics3.toList();
		
//		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}

}
