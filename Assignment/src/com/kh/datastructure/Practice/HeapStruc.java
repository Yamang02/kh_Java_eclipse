package com.kh.datastructure.Practice;

import java.util.ArrayList;
import java.util.List;

public class HeapStruc {
	static int Max_Num = 0;

	// 리스트 선언
	public List<Integer> list = new ArrayList<>();

	public void addNum(int newNum) {
		// 리스트 크기(마지막 인덱스)
		list.add(newNum);
		int lastIndex = list.size() - 1;
		int parentIndex = 0;
		System.out.println(list.get(lastIndex));

		for (int i = lastIndex; i > 0; ) {

			// 부모 인덱스의 값보다 자신의 값이 클 경우 서로 값을 바꿈
			parentIndex = (i - 1) /2;
			
			if (list.get(i) > list.get(parentIndex)) {
				int switchingNum = list.get(parentIndex);
				list.set(parentIndex, list.get(i));
				list.set(i, switchingNum);
				
				i = parentIndex;
				
			} else {
				break;
			}
		}
	}

	public int delNum() {
		// 가장 위에 있는 루트 노드의 값을 반환
		Max_Num = list.get(0);

		// 마지막 노드의 값을 해당 자리에 대입
		int lastIndex = list.size() - 1;
		list.add(0, list.get(lastIndex));
		int parent_index = 0;

		// 해당값과 자식노드들에 대한 비교(작을 시 아래로, 크거나 같을시 그대로)

		for (;;) {

			int left_child_index = (parent_index * 2 + 1);
			int right_child_index = (parent_index * 2 + 2);

			// 같은 경우 임의로 왼쪽 자식노드와 비교
			if (list.get(left_child_index).compareTo(list.get(right_child_index)) >= 0) {
				if (list.get(parent_index).compareTo(left_child_index) > 0) {
					break;
				} else {
					int SwitchingNum = list.get(parent_index);
					list.set(list.get(left_child_index), parent_index);
					list.set(SwitchingNum, left_child_index);
					parent_index = left_child_index;
				}
			} else {
				if (list.get(parent_index).compareTo(right_child_index) > 0) {
					break;
				} else {
					int SwitchingNum = list.get(parent_index);
					list.set(list.get(right_child_index), parent_index);
					list.set(SwitchingNum, right_child_index);
					parent_index = right_child_index;
				}
			}

			if (left_child_index == lastIndex || right_child_index == lastIndex) {
				break;
			}
		}
		list.remove(lastIndex);
		return HeapStruc.Max_Num;
	}
}
