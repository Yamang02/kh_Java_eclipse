package com.kh.io.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	// 필드
	Scanner sc = new Scanner(System.in);

	// 생성자
	public FileDao() {
	}

	// 메소드
	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		// 값을 Scanner로 입력 받고 해당 입력 값이 "exit"일 경우 반복문을 빠져 나감
		while (true) {
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝)");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				break;
			} else {
				sb.append(input);
				sb.append("\n");
			}
		}

		// 저장하시겠습니까? (y/n)
		System.out.println("저장하시겠습니까? (y/n)");
		char input2 = sc.nextLine().charAt(0);

		// 입력 받은 값이 대문자이든 소문자이든 상관없이 "y"이면, 저장할 파일명을 입력받음
		if (input2 == 'y' | input2 == 'Y') {
			System.out.println("저장할 파일명을 입력하세요");
			String fileName = sc.nextLine() + ".txt";

			// 입력받은 파일명에 해당 sb 데이터 출력
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
				bw.write(sb.toString());
				System.out.printf("%s파일에 성공적으로 저장하였습니다.\n", fileName);

			} catch (IOException e) {
				e.printStackTrace();

			}
		} else { // 기타값은 메뉴로 돌아감
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}
	}

	public void fileOpen() {
		// 열 파일명을 받아 열기
		System.out.print("열기 할 파일명 : ");
		String input3 = sc.nextLine();
		String fileName = input3 + ".txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String value = "";
			while ((value = br.readLine()) != null) {
				System.out.println(value);
			}

		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다");

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void fileEdit() {

		System.out.print("수정할 파일명 : ");
		String input4 = sc.nextLine();
		String fileName = input4 + ".txt";

		// 반복문을 통해 해당 파일의 내용을 readLine()메소드로 콘솔에 출력
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String value = "";
			while ((value = br.readLine()) != null) {
				System.out.println(value);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 값을 Scanner로 입력 받고 해당 입력 값이 "exit"일 경우 반복문을 빠져 나감
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝)");
			String input5 = sc.nextLine();

			if (input5.equals("exit")) {
				break;

			} else { // 기타 경우 sb에 누적 저장
				sb.append(input5);
				sb.append("\n");
			}
		}
		// 저장하시겠습니까? (y/n)
		System.out.println("저장하시겠습니까? (y/n)");
		char input6 = sc.nextLine().charAt(0);

		if (input6 == 'y' | input6 == 'Y') {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

				// 입력받은 파일명에 해당 sb 데이터 출력
				bw.write(sb.toString());
				System.out.printf("%s파일의 내용이 변경되었습니다.\n", fileName);

			} catch (IOException e) {
				e.printStackTrace();

			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}

	}

}
