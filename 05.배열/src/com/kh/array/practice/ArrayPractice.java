package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void method1() {
		int[] iArray = new int[10];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = i + 1;
			System.out.print(iArray[i] + " ");
		}
	}

	public void method2() {
		int[] iArray = new int[10];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = iArray.length - i;
			System.out.print(iArray[i] + " ");
		}
	}

	public void method3() {
		// 변수 선언 및 스캐너 임포트
		int size = 0;
		Scanner scanner = new Scanner(System.in);

		// 변수 입력 받기
		System.out.print("임의의 양의 정수 입력 > ");
		size = scanner.nextInt();

		// 배열 크기 할당 및 계산
		int[] iArray = new int[size];
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = i + 1;
			System.out.print(iArray[i] + " ");
		}

	}

	public void method4() {
		String[] fruit = new String[5];
		fruit[0] = "사과";
		fruit[1] = "귤";
		fruit[2] = "포도";
		fruit[3] = "복숭아";
		fruit[4] = "참외";

		System.out.println(fruit[1]);
	}

	public void method5() {
		// 변수 선언, 스캐너 임포트
		int count = 0;
		String value = "";
		String[] sArray;
		char search = '\u0000';
		Scanner scanner = new Scanner(System.in);

		// 문자열 값 입력 받기 , 값에 따른 배열 생성
		System.out.printf("임의의 문자열을 입력하세요 > ");
		value = scanner.nextLine();
		char cArray[] = new char[value.length()];

		// 값 쪼개서 배열에 배치
		for (int i = 0; i < value.length(); i++) {
			cArray[i] = value.charAt(i);
		}

		// 검색할 문자 값 입력 받기
		System.out.printf("검색할 문자를 입력하세요 > ");
		search = scanner.nextLine().charAt(0);
		scanner.close();

		// 배열에서 해당 문자 검색하기, 일치한다면 위치값 반환해 출력
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", value, search);
		for (int i = 0; i < value.length(); i++) {
			if (cArray[i] == search) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		// 출력
		System.out.printf("%c 개수 : %d", search, count);
	}

	public void method6() {
		// "월" ~ "일"(요일)까지 초기화된 문자열 배열을 만들고
		// 0부터 6까지 숫자를 입력 받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다."를 출력하세요.

		// 변수 선언 및 문자열 배열 초기화, 스캐너 임포트
		int num = 0;
		String[] day = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		Scanner scanner = new Scanner(System.in);

		// 0부터 6까지 숫자 입력 받기, 범위 없는 숫자 입력 시 문구 출력
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = scanner.nextInt();
		scanner.close();
		if (!(0 <= num && num <= 6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}

		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력
		System.out.printf("%s요일", day[num]);

	}

	public void method7() {
		// 변수 선언, 스캐너 임포트
		int num = 0; // 배열의 길이
		int input = 0;
		int sum = 0; // 배열값 저장
		Scanner scanner = new Scanner(System.in);

		// 사용자 값 입력, 정수형 배열 선언 할당
		System.out.printf("정수 : ");
		num = scanner.nextInt();
		int[] iArray = new int[num];

		// 배열의 인덱스마다 값을 입력 받기 및 초기화
		for (int i = 0; i < iArray.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			input = scanner.nextInt();
			iArray[i] = input;
			sum += input;
		}
		scanner.close();
		for (int i = 0; i < iArray.length; i++) {
			System.out.printf("%d \n", iArray[i]);
		}
		// 배열 핪 값 출력
		System.out.println("총합 : " + sum);
	}

	public void method8() {
		// 변수 선언, 스캐너 임포트
		int num = 0;
		Scanner scanner = new Scanner(System.in);

		// 적절한 값 입력 받기
		do {
			System.out.print("정수 : ");
			num = scanner.nextInt();

			if ((num % 2 == 1) && (num >= 3)) {
				break;
			}

			System.out.println("다시 입력하세요.");
		} while (true);

		// 배열 생성
		int[] iArray = new int[num];

		// 오름차순과 내림차순 출력
		for (int i = 0; i < iArray.length; i++) {
			if ((num / 2) > i - 1) {
				iArray[i] = i + 1;
			} else {
				iArray[i] = num - i;
			}
		}
		for (int i = 0; i < iArray.length - 1; i++) {
			System.out.printf("%d, ", iArray[i]);
		}
		System.out.printf("%d", iArray[num - 1]);
	}

	public void method9() {
		// 배열
		int[] iArray = new int[10];

		// 난수 값 초기화
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 10 + 1);
		}

		// 출력
		for (int i = 0; i < iArray.length; i++) {
			System.out.printf("%d ", iArray[i]);
		}
	}

	public void method10() {
		// 배열
		int max = 0;
		int min = 0;
		int[] iArray = new int[10];

		// 난수 값 초기화
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = (int) (Math.random() * 10 + 1);
		}

		// 최대값 최소값 찾기
		for (int i = 0; i < iArray.length - 1; i++) {
			min = iArray[0];
			max = iArray[0];
			if (iArray[i] <= min) {
				min = iArray[i];
			}
			if (iArray[i] >= max) {
				max = iArray[i];
			}
		}

		// 출력
		for (int i = 0; i < iArray.length; i++) {
			System.out.printf("%d ", iArray[i]);
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	public void method11() {
		// 배열 생성, 변수 선언
		int[] iArray = new int[10];
		int random = 0;

		// 임의의 정수를 생성하고 배열의 첫 번째부터 넣을 자리까지 같은 값이 있는지 비교
		for (int i = 0; i < iArray.length; i++) {
			random = (int) (Math.random() * 10 + 1);
			for (int j = 0; j <= i; j++) {
				if (random == iArray[j]) { // 같은 값이 있다면 새로운 값을 rnd에 넣고 다시 첫 번째부터 비교
					random = (int) (Math.random() * 10 + 1);
					j = -1;
				}
				continue;
			} // 위 반복문이 종료될 시 rnd 값은 이전 배열의 값들과 모두 다른 값이므로 새로운 자리에 값을 대입
			iArray[i] = random;
		}

		// 출력
		for (int i = 0; i < iArray.length; i++) {
			System.out.printf(iArray[i] + " ");
		}
	}

	public void practice11() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;

					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void method12() {
		int[] iArray = new int[6];
		int random = 0;

		for (int i = 0; i < iArray.length; i++) {
			random = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < iArray.length; j++) {
				if (random == iArray[j]) {
					random = (int) (Math.random() * 45 + 1);
					j = -1;
				}
				continue;
			}
			iArray[i] = random;
		}

		Arrays.sort(iArray);

		for (int i = 0; i < iArray.length; i++) {
			System.out.printf(iArray[i] + " ");
		}
	}

	public void method13() {
		String joomin;
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민등록번호(-포함) : ");
		joomin = scanner.nextLine();
		scanner.close();

		char[] sArray = new char[joomin.length()];

		for (int i = 0; i < joomin.length() - 6; i++) {
			sArray[i] = joomin.charAt(i);
		}
		for (int i = joomin.length() - 6; i < joomin.length(); i++) {
			sArray[i] = '*';
		}

		for (int i = 0; i < sArray.length; i++) {
			System.out.print(sArray[i]);
		}
		scanner.close();
	}
}
