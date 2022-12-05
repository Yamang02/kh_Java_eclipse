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

		while (true) {
			String input = "";

			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝)");

			// 값을 Scanner로 입력 받고 해당 입력 값이 "exit"일 경우 반복문을 빠져 나감
			input = sc.nextLine();

			if (input.equals("exit")) {
				break;
			} else {
				sb.append(input);
				sb.append("\n");
			}
		}

		// 저장하시겠습니까? (y/n)
		char input = '\u0000';
		System.out.println("저장하시겠습니까? (y/n)");
		input = sc.nextLine().charAt(0);

		// 입력 받은 값이 대문자이든 소문자이든 상관없이 "y"이면, 저장할 파일명을 입력받음
		if (input == 'y' | input == 'Y') {
			String fileName = "";
			System.out.println("저장할 파일명을 입력하세요");
			fileName = sc.nextLine() + ".txt";

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

				// 입력받은 파일명에 해당 sb 데이터 출력
				bw.write(sb.toString());
				System.out.printf("%s파일에 성공적으로 저장하였습니다.\n", fileName);

			} catch (IOException e) {
				e.printStackTrace();

			} finally {

				sc.close();

			}
		} else {
			sc.close();
			System.out.println("다시 메뉴로 돌아갑니다.");
			return;
		}

	}

	public void fileOpen() {

		String input = "";
		//
		System.out.print("열기 할 파일명 : ");
		input = sc.nextLine();
		String filename = input + ".txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String value = "";

			while ((value = br.readLine()) != null) {
				System.out.println(value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {

			sc.close();
		}
	}

	public void fileEdit() {

		String input = "";
		System.out.print("수정할 파일명 : ");
		input = sc.nextLine();
		String fileName = input + ".txt";

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

		while (true) {
			StringBuilder sb = new StringBuilder();
			String input2 = "";
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝)");

			// 값을 Scanner로 입력 받고 해당 입력 값이 "exit"일 경우 반복문을 빠져 나감
			input2 = sc.nextLine();

			if (input2.equals("exit")) {
				break;
			} else {
				sb.append(input);
				sb.append("\n");
			}

			// 저장하시겠습니까? (y/n)
			char input3 = '\u0000';
			System.out.println("저장하시겠습니까? (y/n)");
			input3 = sc.nextLine().charAt(0);

			if (input3 == 'y' | input3 == 'Y') {

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {

					// 입력받은 파일명에 해당 sb 데이터 출력
					bw.write(sb.toString());
					System.out.printf("%s파일의 내용이 변경되었습니다.\n", fileName);

				} catch (IOException e) {
					e.printStackTrace();

				} finally {
					sc.close();
				}
			} else {
				sc.close();
				System.out.println("다시 메뉴로 돌아갑니다.");
				return;
			}

		}

	}
}
