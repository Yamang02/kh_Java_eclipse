package com.kh.inherit.practice;

public class Employee extends Person {
	
	// 필드
	private int salary; //급여
	private String dept;
	

	// 생성자
	public Employee() {

	}


	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.setName(name);
		this.salary = salary;
		this.dept = dept;
	} 
	// G & S

	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}

	
	// 메소드
	@Override
	public String information() {
		return super.information()+ "Employee [salary=" + salary + ", dept=" + dept + "]";
	}


	
	
	
}
