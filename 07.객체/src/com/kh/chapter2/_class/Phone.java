package com.kh.chapter2._class;

// 접근 제한자 생략 시 default 접근 제한이 적용된다.
class Phone {
	//
	private String name;
	
	private String color;
	
	private String brand;

	
	// 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
//	public void information() {
//		System.out.printf("%s의 %s 컬러의 %s입니다.", brand, color, name);
//	}
	
	
}
