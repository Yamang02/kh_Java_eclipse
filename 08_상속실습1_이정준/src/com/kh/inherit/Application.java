package com.kh.inherit;

import java.util.Scanner;

import com.kh.inherit.practice.Employee;
import com.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {

		// 객체 배열 생성
		Student[] stuArray = new Student[3];

		// 학생 정보 초기화
		stuArray[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		stuArray[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		stuArray[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");

		// 학생 정보 모두 출력
		for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i].information());
		}

		// 최대 10명의 사용 정보를 기록할 수 있게 배열 할당
		Employee[] empArray = new Employee[10];
		int empcnt = 0;
		Scanner scanner = new Scanner(System.in);

		// 사원들의 정보를 키보드로 계속 입력 받고
		while (true) {
			// 6개 매개변수입력값
			System.out.println("사원 이름 > ");
			String name = scanner.nextLine();
			System.out.println("사원 나이 > ");
			int age = scanner.nextInt();
			System.out.println("사원 키(소수점 첫자리까지) > ");
			double height = scanner.nextDouble();
			System.out.println("사원 몸무게(소수점 첫자리까지) > ");
			double weight = scanner.nextDouble();
			System.out.println("사원 급여(원) > ");
			int salary = scanner.nextInt();
			scanner.nextLine();
			System.out.println("사원 부서 > ");
			String dept = scanner.nextLine();

			empArray[empcnt] = new Employee(name, age, height, weight, salary, dept);
			empcnt++;

			if (empcnt == 9) {
				break;
			}
			System.out.println("사원을 계속 추가하십니까? y/n");
			char answer = scanner.nextLine().charAt(0);

			if (answer == 'n') {
				break;
			}
		}
		scanner.close();
		for (int i = 0; i < empcnt; i++) {
			System.out.println(empArray[i].information());
		}
	}
}