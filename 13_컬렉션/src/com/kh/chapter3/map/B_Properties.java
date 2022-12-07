package src.com.kh.chapter3.map;

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
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		System.out.println(prop);
		System.out.println();
		
		// value 값을 읽어오기
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("Music"));
		
		
	}
	
}
