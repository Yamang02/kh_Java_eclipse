package com.kh.chapter3._interface;

public interface Basic {
	// 인터페이스에서는 static final keyword가 없어도 상수로 선언되는 필드
	/*public static final */ int Num =10;
	
	// 인터페이스에서 method는 무조건 추상 메소드이다.
	
	/* public abstract */ void turnOn();
	
	/* public abstract */ void turnOff();
	
	// 이들은 구현 메소드에서 반드시 오버라이딩해서 재정의해야 한다.
}
