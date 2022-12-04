package com.kh.operator.practice;

public class F_Compound {
	
	public void method1() {
		
		int num = 12;
		String str = "Hello";
		
		num += 3; // num = num + 3
		System.out.println(num);
	
		num	-= 5; // num = num - 5
		System.out.println(num);
	
		num *= 6; // num = num * 6 
		System.out.println(num);
		
		num /= 3; // num = num / 3 
		System.out.println(num);
		
		num %= 3; // num = num % 4
		System.out.println(num);
		
		str += " World!"; // str = str + " World!"
		System.out.println(str);
	}

}
