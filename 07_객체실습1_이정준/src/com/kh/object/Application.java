package com.kh.object;

import com.kh.object.pratice.Product;

public class Application {

	public static void main(String[] args) {

		Product[] pArray = new Product[3];

		pArray[0] = new Product("ssgnote9", "GL럭시노트9", "경기도 수원", 960000, 10.0);
		pArray[1] = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		pArray[2] = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

		for (int i = 0; i < pArray.length; i++) {
			System.out.printf(pArray[i].information()+"\n");
		}
		System.out.println("==============================================");

		for (int i = 0; i < pArray.length; i++) {
			pArray[i].setPrice(1200000);
			pArray[i].setTax(0.05);
		}
		for (int i = 0; i < pArray.length; i++) {
			System.out.printf(pArray[i].information()+"\n");
		}
		System.out.println("==============================================");
		
		for (int i = 0; i < pArray.length; i++) {
			System.out.printf("상품명 = %s\n", pArray[i].getName());
			System.out.printf("부가세 포함 가격 = %d원\n\n", (int) (pArray[i].getPrice() + (pArray[i].getPrice()*pArray[i].getTax()))); 
		}
		
		
	}

}
