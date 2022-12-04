package com.kh.object.pratice;

public class Product {

	// 필드
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	// 생성자
	public Product() {

	}
	
	public Product(String id, String name, String site, int price, double tax) {
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}

	
	
	// 메소드
	public String information() {
		String info = "";
		info = this.getId() +" "+ this.getName() +" "+ this.getSite() +" "+ this.getPrice() +" "+ this.getTax();
		return info;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
}
