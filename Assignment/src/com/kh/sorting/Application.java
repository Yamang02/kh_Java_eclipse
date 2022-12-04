package com.kh.sorting;

import com.kh.sorting.practice.Merge_Sort;

public class Application {

	public static void main(String[] args) {

		int[] iArray = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Merge_Sort.merge_sort(iArray);
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i]+" ");
		}
	}
}
