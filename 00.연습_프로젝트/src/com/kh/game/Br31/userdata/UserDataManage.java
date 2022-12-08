package com.kh.game.Br31.userdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.kh.game.Br31.userdata.vo.User;

public class UserDataManage extends User {
	private static final long serialVersionUID = 1L;

	Scanner sc = new Scanner(System.in);
	// 저장 경로
	static String savePath = "D:\\Github\\kh_Java_eclipse\\00.연습_프로젝트\\src\\com\\kh\\game\\Br31\\userdata\\userdatafile\\";

	// 생성자
	public UserDataManage(String userID) {
		super(userID);
	}

	// 메소드
	// 유저 로그인 메소드
	public static void logIn() {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 기록할 ID를 입력하세요. > ");
		String ID = sc.nextLine();
		User tempUser = new User("tempID");
		File path = new File(savePath + ID + ".dat");

		boolean exist = path.exists();
		if (exist) { // 기존 유저 로그인시 해당 유저의 정보 가져온 후 해당 데이터로 게임시작
			
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savePath + ID + ".dat"))) {

				try {
					User.setUserID(User.getUserID());
					tempUser.gameCount = ((User) ois.readObject()).gameCount;
					tempUser.winCount = ((User) ois.readObject()).winCount;

					System.out.println(tempUser);

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			
			
			
			System.out.println("ID 정보가 존재합니다. 해당 아이디로 게임을 시작합니다.");
		} else { // 새로운 유저 로그인시 기본 object 생성, 기본정보 넘긴 후 게임시작
			try {
				UserDataManage user = new UserDataManage(ID);
				path.createNewFile();

				try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

					oos.writeObject(user);

				} catch (FileNotFoundException e) {
					e.printStackTrace();

				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("ID 정보가 존재하지 않습니다. 해당 ID로 정보을 생성하여 게임을 시작합니다.");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
	// 유저 필드 정보 저장 메소드

	// 유저 게임시도 횟수 관리 메소드
	public static void gameCount() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(savePath + userID + ".dat"))) {

			try {
				User user = (User) ois.readObject();

				System.out.println(user);

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 유저 텍스트 파일 생성
	public void createUserTextFile() {

		File file = new File("/userdatafile/" + userID + ".txt");

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
