package com.kh.inherit.before;

public class Desktop {

	// 필드
	private String brand;
	
	private String pCode;
	
	private String name;
	
	private int price;
	
	private boolean allInOne;

	
	// 생성자
	public Desktop() {
	}

	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
		this.allInOne = allInOne;
	}
	
	// 메소드
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public String info() {
		String str = "";
		str = "brand : " + brand + ", pCode : " + pCode + ", pirce : " + price 
				+ ", name : " + name + ", allInOn : " + allInOne;
		return str;
	}

	
	}
	

