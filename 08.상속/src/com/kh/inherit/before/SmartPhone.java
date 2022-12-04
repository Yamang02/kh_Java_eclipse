package com.kh.inherit.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SmartPhone {
	// 필드
	private String brand;
	
	private String pCode;
	
	private String name;
	
	private int price;
	
	private String mobileAgency;  //통신사
	
	
	//메소드
	public String info() {
		String str = "";
		str = "brand : " + brand + ", pCode : " + pCode + ", pirce : " + price 
				+ ", name : " + name + ", mobileAgency : " + mobileAgency;
		return str;
	}
	
	
}
