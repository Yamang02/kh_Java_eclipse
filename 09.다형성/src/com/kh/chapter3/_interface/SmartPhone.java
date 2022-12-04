package com.kh.chapter3._interface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SmartPhone extends Product {

	// 필드 선언
	private String mobileAgency;

	// 메소드
	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency;
	}
	
	@Override
	public String info() {
		return super.info() + ", mobileAgency : " + mobileAgency;
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}
	
}
