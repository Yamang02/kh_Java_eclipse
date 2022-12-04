package com.kh.chapter3.field;

public class B_StaticField {
	// static 키워드가 붙은 필드는 프로그램을 실행하자마자 static 메모리 영역에 할당된다.
	public static String pubsta ="public static";
	public static int num = 2;
	private static String priSta = "private static";
	
//	static 필드에 대한 Getter, Setter 메소드 또한 static 키워드를 붙여야 한다.	
	public static String getPriSta() {
		return priSta;
	}
	public static void setPriSta(String priSta) {
		B_StaticField.priSta = priSta;
	}

	
	
}
