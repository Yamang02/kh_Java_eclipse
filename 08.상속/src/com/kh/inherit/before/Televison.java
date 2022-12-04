package com.kh.inherit.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Televison {

	private String brand;
	
	private String pCode;
	
	private String name;
	
	private int price;
	
	private int inch;
	
	public String info() {
		return "brand : " + brand + ", pCode : " + pCode + ", pirce : " + price 
				+ ", name : " + name + ", inch : " + inch;
	}


}


