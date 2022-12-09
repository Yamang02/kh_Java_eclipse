package com.kh.game.Br31.userdata.vo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	// 필드
	public String userID = "";
	public int gameCount;
	public int winCount;
	public static String IDAddress = "";
	public static User tempUser;
	
	// 생성자
	public User() {
		userID = "";
		gameCount = 0;
		winCount = 0;
		
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}




	public int getGameCount() {
		return gameCount;
	}


	public void setGameCount(int gameCount) {
		this.gameCount = gameCount;
	}


	public int getWinCount() {
		return winCount;
	}


	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}
	
	@Override
	public String toString() {
		return "User [ 아이디 " + userID + ", 게임 플레이 횟수 : " + gameCount + ", 이긴 횟수 : " + winCount + "]";
	}

}
