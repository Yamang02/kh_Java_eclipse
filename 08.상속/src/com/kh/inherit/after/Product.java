package com.kh.inherit.after;

public class Product {

	// 필드
	protected String brand;
	
	protected String pCode;
	
	protected String name;
	
	protected int price;

	// 생성자
	public Product() {
	}

	public Product(String brand, String pCode, String name, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
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

	protected String info() {
		return "brand : " + brand + ", pCode : " + pCode + ", price : " + price + ", name : " + name;
	}

}
