package com.kh.dimension.practice;

import java.util.Iterator;
import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		// 4행 4열짜리 정수형 배열을 선언, 변수 선언
		int[][] iArray = new int[4][4];
		int value = 1;

		// 1부터 16까지 할당
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				iArray[i][j] = value;
				System.out.printf("%2d ", value);
				value++;
			}
			System.out.println();
		}
	}

	public void practice2() {
		// 4행 4열짜리 정수형 배열을 선언, 변수 선언
		int[][] iArray = new int[4][4];
		int value = 16;

		// 1부터 16까지 할당
		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray[i].length; j++) {
				iArray[i][j] = value;
				System.out.printf("%2d ", value);
				value--;
			}
			System.out.println();
		}
	}

	public void practice3() {
		// 문자열 배열 선언 및 생성
		String[][] sArray = new String[3][3];

		// 할당 및 선언
		for (int i = 0; i < sArray.length; i++) {
			for (int j = 0; j < sArray.length; j++) {
				sArray[i][j] = "(" + i + ", " + j + ")";
			}
		}
		// 출력
		for (int i = 0; i < sArray.length; i++) {
			for (int j = 0; j < sArray.length; j++) {
				System.out.printf("%s", sArray[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		// 정수형 2차원 배열 선언 및 생성
		int[][] iArray = new int[4][4];
		int rwSum = 0;
		int clmnSum = 0;

		// 조건값 대입
		// 2행 2열까지는 임의의 정수값 저장
		for (int i = 0; i < iArray.length - 1; i++) {
			rwSum = 0;
			for (int j = 0; j < iArray[i].length - 1; j++) {
				iArray[i][j] = (int) (Math.random() * 10 + 1);
				rwSum += iArray[i][j];
			}

			// i행 마지막 열의 값은 각 행 값의 합
			iArray[i][iArray[i].length - 1] = rwSum;
		}

		// 모든 행이 채워진 후 각 열의 합 계산
		for (int i = 0; i < iArray.length; i++) {
			clmnSum = 0;
			for (int j = 0; j < iArray.length; j++) {
				clmnSum += iArray[j][i];
			}

			// 마지막 행 i열의 값은 각 열의 값의 합
			iArray[iArray.length - 1][i] = clmnSum;
		}

		// 출력
		for (int i = 0; i < iArray.length; i++) {
			for (int j = 0; j < iArray.length; j++) {
				System.out.printf("%3d", iArray[i][j]);
			}
			System.out.println();

		}
	}

	public void practice5() {
		// 2차원 배열의 행과 열 값 직접 입력 받기
		int column = 0;
		int row = 0;
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);

		// 제대로 된 값 입력 받기
		do {
			System.out.println("행 크기 : ");
			row = scanner.nextInt();

			if (1 <= row && row <= 10) {
				break;
			} else {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			}
		} while (true);

		do {
			System.out.println("열 크기 : ");
			column = scanner.nextInt();

			if (1 <= column && column <= 10) {
				break;
			} else {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			}
		} while (true);

		// 입력 받은 값을 통한 새로운 배열의 생성
		char cArray[][] = new char[row][column];

		// 임의의 문자값 대입
		for (int i = 0; i < cArray.length; i++) {
			for (int j = 0; j < cArray[i].length; j++) {
				cArray[i][j] = (char) ((Math.random() * 25) + 64);
			}
		}

		// 출력
		for (int i = 0; i < cArray.length; i++) {
			for (int j = 0; j < cArray[i].length; j++) {
				System.out.printf("%c ", cArray[i][j]);
			}
			System.out.println();
		}

	}

	public void practice6() {

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i] + " ");
			}
		}

	}

	public void practice7() {
		// 2차원 배열의 행과 열 값 직접 입력 받기
		int column = 0;
		int row = 0;
		char ch = 'a';
		Scanner scanner = new Scanner(System.in);

		// 행의 크기 입력 받기
		System.out.println("행 크기 : ");
		row = scanner.nextInt();
		char[][] cArray = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.printf("%d행의 크기 : ", i);
			column = scanner.nextInt();
			cArray[i] = new char[column];
		}
		scanner.close();

		// 각 인덱스에 a부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요
		for (int i = 0; i < cArray.length; i++) {
			for (int j = 0; j < cArray[i].length; j++) {
				cArray[i][j] = ch;
				System.out.printf("%c ", ch);
				ch++;
			}
			System.out.println();
		}
	}

	public void practice8() {

//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하

		int order = 0;

		// 1차원 배열을 선언하고 명단 출석부에 초기화
		String[] names = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };

		// 3행 2열의 2차원 배열 2개 이용 분단을 나눠서 저장
		String[][] attendance1 = new String[3][2];
		String[][] attendance2 = new String[3][2];

		for (int i = 0; i < attendance1.length; i++) {
			for (int j = 0; j < attendance1[i].length; j++) {
				attendance1[i][j] = names[order];
				order++;
			}
		}
		for (int i = 0; i < attendance2.length; i++) {
			for (int j = 0; j < attendance2[i].length; j++) {
				attendance2[i][j] = names[order];
				order++;
			}
		}
		// 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리 배치.
		System.out.println("== 1분단 == ");
		for (int i = 0; i < attendance1.length; i++) {
			for (int j = 0; j < attendance1[i].length; j++) {
				System.out.print(attendance1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 == ");
		for (int i = 0; i < attendance2.length; i++) {
			for (int j = 0; j < attendance2[i].length; j++) {
				System.out.print(attendance2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {

//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하

		int order = 0;
		String sname = "";
		
		// 1차원 배열을 선언하고 명단 출석부에 초기화
		String[] names = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };

		// 3행 2열의 2차원 배열 2개 이용 분단을 나눠서 저장
		String[][] attendance1 = new String[3][2];
		String[][] attendance2 = new String[3][2];

		for (int i = 0; i < attendance1.length; i++) {
			for (int j = 0; j < attendance1[i].length; j++) {
				attendance1[i][j] = names[order];
				order++;
			}
		}
		for (int i = 0; i < attendance2.length; i++) {
			for (int j = 0; j < attendance2[i].length; j++) {
				attendance2[i][j] = names[order];
				order++;
			}
		}
		// 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리 배치.
		System.out.println("== 1분단 == ");
		for (int i = 0; i < attendance1.length; i++) {
			for (int j = 0; j < attendance1[i].length; j++) {
				System.out.print(attendance1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 == ");
		for (int i = 0; i < attendance2.length; i++) {
			for (int j = 0; j < attendance2[i].length; j++) {
				System.out.print(attendance2[i][j] + " ");
			}
			System.out.println();
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		sname = scanner.nextLine();
		System.out.printf("검색하신 %s 학생은 ",sname);
		
		int boondan = 0;
		int row = 0;
		int location = 0;
		
		for (int i = 0; i < attendance1.length; i++) {
			for (int j = 0; j < attendance1[i].length; j++) {
				if(sname.equals(attendance1[i][j])) {
					boondan = 1;
					row = i;
					location = j;
					break;
				} 
			}
		}
		
		for (int i = 0; i < attendance2.length; i++) {
			for (int j = 0; j < attendance2[i].length; j++) {
				if(sname.equals(attendance2[i][j])) {
					boondan = 2;
					row = i;
					location = j;
					break;
				} 
			}
		}
		System.out.printf("%d분단 %d번째 줄 %s에 있습니다.\n",boondan, row+1, (location % 2 == 0 ? "왼쪽" : "오른쪽"));
	}
}
