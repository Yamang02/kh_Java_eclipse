package com.kh.chapter1;

import com.kh.chapter1.polymorphism.Desktop;
import com.kh.chapter1.polymorphism.Product;
import com.kh.chapter1.polymorphism.SmartPhone;
import com.kh.chapter1.polymorphism.Television;

public class Application {

	public static void main(String[] args) {
		// 부모 타입의 레퍼런스(참조변수)로 부모 인스터스 다루는 경우
		Product product = new Product();

		// product 참조변수로 Product 클래스의 멤버만 접근 가능
		System.out.println(product.info());

		// 2. 자식 타입의 참조변수로 자식 인스턴스를 다루는 경우
//		Desktop desktop = new Desktop();

		// desktop 참조 변수로 Product, Desktop 클래스의 멤버에 접근 가능
//		System.out.println(desktop.info());
//		System.out.println(desktop.isAllInOne());

		// 3. 부모 타입의 참조변수로 자식 인스턴스를 다루는 경우
		// 업캐스팅
//		Product television = /* (Product) */ new Television();
		Product television = /* (Product) */ new Television();

		// television 참조변수로 Product 클래스의 멤버 접근, television 불가
		television.setBrand("삼성");
		// 오버라이드 메소드의 경우(info)
		System.out.println(television.info());

		// television에 있는 멤버(get inch 메소드)에 접근하려면
		System.out.println(((Television) television).getInch());

		// 4. 배열과 다형성
		// 다형성을 적용하기 전에는 Desktop, SmartPhone 인스턴스를 배열로 다뤄야 하는 경우 각각의 배열을 만들어야 한다.
		Desktop[] array1 = new Desktop[2];
		array1[0] = new Desktop();
		array1[1] = new Desktop();

		SmartPhone[] array2 = { new SmartPhone(), new SmartPhone() };

		// 다형성을 적용하면 부모 클래스의 배열 변수로 다양한 인스턴스들을 가리킬 수 있다.
		Product[] array3 = new Product[4];

		array3[0] = new Desktop("애플", "a1111", "아이맥 24인치", 1500000, true);
		array3[1] = new Desktop("삼성", "s3333", "매직스테이션", 2000000, false);
		array3[2] = new SmartPhone("애플", "a2222", "아이폰12 미니", 900000, "KT");
		array3[3] = new Television("엘지", "t-01", "벽걸이 TV", 2000000, 40);

		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i].info());
		}

//		for (int i = 0; i < array3.length; i++) {
//			if (array3[i] instanceof Desktop) {
//				System.out.println(((Desktop)array3[i]).isAllInOne());
//			} else if (array3[i] instanceof SmartPhone) {
//				System.out.println(((SmartPhone)array3[i]).getMobileAgency());
//			} else {
//				System.out.println(((Television)array3[i]).getInch());
//			}
//		}

		for (Product p : array3) {
			if (p instanceof Desktop) {
				System.out.println(((Desktop) p).isAllInOne());
			} else if (p instanceof SmartPhone) {
				System.out.println(((SmartPhone) p).getMobileAgency());
			} else {
				System.out.println(((Television) p).getInch());
			}
		}
		
		// 매개변수의 다형성
		productInfo(new Desktop());
		productInfo(new SmartPhone());
		productInfo(new Television());
		
	}

//	public static void productInfo(Desktop desktop) {
//		System.out.println(desktop.info());
//	}
//	public static void productInfo(SmartPhone smartPhone) {
//		System.out.println(smartPhone.info());
//	}
//	public static void productInfo(Television television) {
//		System.out.println(television.info());
//	}
	
	public static void productInfo(Product product) {
		System.out.println(product.info());
	}
}
