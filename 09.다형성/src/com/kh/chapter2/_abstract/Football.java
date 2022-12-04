package com.kh.chapter2._abstract;

public class Football extends Sports {
	
	// 생성자
	public Football(int numberOfPlayers) {
		super(numberOfPlayers);
	}

	// 메소드
	@Override
	public void rule() {
		System.out.println("FootBall의 선수는 " + this.numberOfPlayers + "명, 손이 아닌 발로 공을 차야 합니다.");
	}
	
	
	
}
