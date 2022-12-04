package com.kh.star.practice;

public class star {

	public void method1() {
		

		for (int i = 1; i < 10; i++) {
			// 상단부
			if (i < 4) {
				for (int j = 1; j < 9 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j < 2 * i; j++) {
					System.out.print("*");
				}
				System.out.println();
			// 중간부
			} else if (i < 7) {
				for (int j = 1; j < (i - 3) * 2 - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j < 17 - (i - 4) * 4; j++) {
					System.out.print("*");
				}
				System.out.println();
			// 하단부
			} else {
				int col = 0;
				int k = i - 6;
				int sum = k * ((k - 1) * (-1)) / 2;

				if (col < 9) {

					for (int j = 1; j < 6 - k; j++) { // 공백 찍기
						System.out.print(" ");
						col++;
					}
					for (int j = 1; j < 5 + sum; j++) { // 별 찍기
						System.out.print("*");
						col++;
					}
					int recol = 8 - k + sum;

					for (int j = 1; j < 8 - recol; j++) { // 공백 찍기
						System.out.print(" ");
						col++;
					}
				}

				int recol = 9 + sum - k;

				for (int j = 1; j < 9 - recol; j++) { // 공백 찍기
					System.out.print(" ");
				}

				for (int j = 1; j < 5 + sum; j++) { // 별 찍기
					System.out.print("*");
				}

				for (int j = 1; j < 3 - k; j++) { // 공백 찍기
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
