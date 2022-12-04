package com.kh.chapter2._abstract;

public abstract class Sports {

	// 필드
	protected int numberOfPlayers;
	
	// 생성자
	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	// 메소드
	
	/*
	 * 추상 메소드
	 *  - 중괄호({})가 구현되지 않은 미완성의 메소드이다.
	 *  - 자식 클래스에서 재정의하지 않으면 에러가 발생한다.
	 */
	public abstract void rule();  

}
