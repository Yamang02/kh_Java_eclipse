package com.kh.inherit.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Televison extends Product {

	// 필드 선언
	private int inch;

	// 메소드
	public Televison(String brand, String pCode, String name, int price, int inch) {
		super(brand, pCode, name, price);
		this.inch = inch;
	}

	public String info() {
		return super.info() + ", inch : " + inch;
	}

}
