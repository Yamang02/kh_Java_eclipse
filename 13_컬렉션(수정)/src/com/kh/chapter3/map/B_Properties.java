package com.kh.chapter3.map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class B_Properties {
//  properties를 생성하고 저장, 출력 테스트
	public void method1() {
		/*
		 *  Properties
		 * 	- Map 계열이다.
		 * 	- key, Value 세트로 저장된다.
		 * 	- Key, Value는 String으로 제한되어 있다.
		 */

		Properties prop = new Properties();
		
		// 순서 유지되지 않고, 키값 중복 X
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Set", "TreeSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		System.out.println();
		
		// value 값을 읽어오기
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Music"));
		System.out.println();
		
		
		for (Entry<Object, Object> entry : prop.entrySet()) {
			System.out.printf("Key : %s, value : %s\n", entry.getKey(), entry.getValue());
			
		}
			
			
		
	}
	
	public void fileSave() {
		
		Properties prop = new Properties();
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		try {
			prop.store(new FileOutputStream("test1.properties"), "Properties Test 1");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
