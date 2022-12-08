package com.kh.game.Br31.userdata.vo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	// 필드
	public static String userID = "";
	public int gameCount;
	public int winCount;

	
	// 생성자
	public User(String userID) {
		User.userID = userID;
		gameCount = 0;
		winCount = 0;
		
	}


	public static String getUserID() {
		return userID;
	}


	public static void setUserID(String userID) {
		User.userID = userID;
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

}
