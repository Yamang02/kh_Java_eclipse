package com.kh.chapter3._interface;

public class Desktop extends Product {

	private boolean allInOne;

	public Desktop() {
	}

	public Desktop(String brand, String pCode, String name, int price, boolean allInOne) {

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

	@Override
	public void turnOn() {
		System.out.println("데스크톱을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("데스크톱을 끕니다");
	}
}
