package com.kh.chapter1.polymorphism;

/*
 * 상속
 * 
 * 	[표현법]
 * 		[접근제한자] class 클래스명 extends 부모클래스명 {
 *			... 		
 * 		}
 */

public class Desktop extends Product {

	private boolean allInOne;

	public Desktop() {
	}

	/*
	 * 부모 클래스의 필드를 초기화할 수 있는 방법
	 * 
	 * * super : 부모 인스턴스의 주소를 담고 있다.
	 */

	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {
//		super(brand, pCode, name, price);

//		1. super와 .(도트) 연산자로 부모의 필드에 직접 접근
//		super.brand = brand;
//		super.pCode = pCode;
//		super.name = name;
//		super.price = price;

//		2. 부모의 Setter 메소드를 호출해서 초기화
//		super.setBrand(brand);
//		this.setpCode(pCode);
//		setName(name);
//		setPrice(price);

//		3. 부모 생성자 호출해서 초기화
		super(brand, pCode, name, price);
		this.allInOne = allInOne;

	}

	public Desktop(String brand, String pCode, String name, int price) {
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	@Override
	public String info() {
		return super.info() + ", allInOne : " + allInOne;
	}
}
