package com.kh.io;

import java.util.Scanner;

import com.kh.io.model.dao.FileDao;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (!(num == 4)) {

		FileDao fd = new FileDao();

			System.out.println("****** MyNote******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println("번호를 입력하세요");
			num = sc.nextInt();

			switch (num) {
				case 1:
					fd.fileSave();
					
					break;
				case 2:
					fd.fileOpen();
					
					break;
				case 3:
					fd.fileEdit();

					break;
				case 4:
					sc.close();
					return;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
			}

		}
		sc.close();
	}
}
