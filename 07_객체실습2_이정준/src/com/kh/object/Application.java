package com.kh.object;

import com.kh.object.practice.Book;

public class Application {

	public static void main(String[] args) {

		Book[] books = new Book[2];
		books[0] = new Book();
		books[1] = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		for (int i = 0 ; i < books.length ; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.println("=====================================");
		
		books[0].setAuthor("홍길동");
		books[0].setTitle("C언어");
		books[0].setPrice(30000);
		books[0].setDiscountRate(0.1);
		
		System.out.println("수정된 결과 확인");
		
		System.out.println(books[0].information());
		
		System.out.println("=====================================");
		
		for (int i = 0 ; i < books.length ; i++) {
			double Dis = books[i].getPrice() - (books[i].getPrice()*books[i].getDiscountRate());
			
			System.out.printf("도서명 = %s\n", books[i].getTitle());
			System.out.printf("할인된 가격 = %d원\n",(int)Dis);
		}
		
	}

}
