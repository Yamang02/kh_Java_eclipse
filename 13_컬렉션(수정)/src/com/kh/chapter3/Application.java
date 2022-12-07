package com.kh.chapter3;

import com.kh.chapter3.map.B_Properties;

public class Application {

	public static void main(String[] args) {

		System.out.println("프로그램 실행");
		
//		new B_Properties().fileSave();
		new B_Properties().fileRead();
		
		System.out.println("프로그램 종료");
		
	}

}
