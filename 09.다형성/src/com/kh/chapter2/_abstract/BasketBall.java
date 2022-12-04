package com.kh.chapter2._abstract;

public class BasketBall extends Sports {

	// 생성자
	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	// 메소드
	@Override
	public void rule() {
		System.out.println("BasketBall의 선수는 " + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야 합니다.");
	}
	
}
