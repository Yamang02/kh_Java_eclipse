package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

		Animal[] animal = new Animal[5]; 
		
		// Dog cat 생성을 위한 랜덤값
		
		
		for (int i = 0; i < animal.length ; i++) {
			int rnd = (int) (Math.random()*2);
			if (rnd == 0 ) {
				animal[i] = new Dog("땅콩이", "개", 2);
			} else {
				animal[i] = new Cat("나비", "고양이", "강동구", "노랑");
			}
		}
		
		for (Animal animal2 : animal) {
			animal2.speak();
		}
	}
}
