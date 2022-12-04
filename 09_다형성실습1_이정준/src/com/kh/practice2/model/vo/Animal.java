package com.kh.practice2.model.vo;

public abstract class Animal {

	// 필드
	private String name;
	private String kinds;
	
	
	// 생성자
	protected Animal() {
	}
	
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}

	// 메소드
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String toString() {
		String str;
		str = "저의 이름은 " + name + "이고, 종류는 " +kinds + "입니다. ";
		return str;
	}
	
	public abstract void speak();	
	

	

	
}
