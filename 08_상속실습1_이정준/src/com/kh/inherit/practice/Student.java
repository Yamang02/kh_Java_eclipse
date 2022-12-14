package com.kh.inherit.practice;

public class Student extends Person {

	// 필드
	private int grade;
	private String major;
	
	
	//생성자
	public Student() {
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.setName(name);
		this.grade = grade;
		this.major = major;
	}
	
	// G & S
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// 메소드
	public String information() {
		return super.information() + "Studnet [grade=" + grade + ", major=" + major + "]";
	}
	
	
}
