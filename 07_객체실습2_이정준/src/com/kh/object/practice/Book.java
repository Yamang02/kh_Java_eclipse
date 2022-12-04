package com.kh.object.practice;

public class Book {

	// 필드 선언
	String title;
	int price;
	double discountRate;
	String author;

	// 생성자 선언
	public Book() {
	}

	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// 메소드 선언
	public String information() {
		String str = "";
		str = title + "\t" + price + "\t" + discountRate+ "\t" + author;
		return str;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	

}
