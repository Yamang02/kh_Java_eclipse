package com.kh.practice2.model.vo;

public class Dog extends Animal {

	// 변수
	public final static String PLACE = "애견카페";

	private int weight;

	// 생성자
	public Dog() {
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	// 메소드
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static String getPlace() {
		return PLACE;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다. ");
	}
}
