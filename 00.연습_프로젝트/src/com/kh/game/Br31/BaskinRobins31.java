package com.kh.game.Br31;

public abstract class BaskinRobins31 {
	
	public int cnt = 0;
	public int usercnt = 0;
	public String user = "";
	public String result = "";
	public int choose = 0;
	
	
	public void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void intro() {
		System.out.println("베스킨~ 라빈스~");
		sleep(600);
		System.err.println("31~");
		sleep(600);
		System.out.println("귀엽고~ 깜찍하게~");
		sleep(600);
		System.err.println("31~");
		sleep(600);
	}
	
	public abstract void GameStart();
	
	public void PrintRestartMessage() {
		System.out.println("게임을 다시 시작하시겠습니까? Y / N 입력");		
	}
		
}	

