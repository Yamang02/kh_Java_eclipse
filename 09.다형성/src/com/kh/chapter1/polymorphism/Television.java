package com.kh.chapter1.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Television extends Product {

	// 필드 선언
	private int inch;

	// 메소드
	public Television(String brand, String pCode, String name, int price, int inch) {
		super(brand, pCode, name, price);
		this.inch = inch;
	}

	public String info() {
		return super.info() + ", inch : " + inch;
	}

}
