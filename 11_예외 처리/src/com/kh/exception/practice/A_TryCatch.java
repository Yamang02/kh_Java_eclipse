package com.kh.exception.practice;

public class A_TryCatch {
	/*
	 * try-catch 
	 *   [표현법] 
	 *     try { 
	 *     
	 *     		예외가 발생할 가능성이 있는 코드가 위치한다. 
	 *     
	 *     	} catch(Exception e) {
	 *     
	 *     		try블록에서 예외가 발생하면 실행을 멈추고 catch 블록으로 이동하여 예외 처리 코드를 실행한다. 
	 *     
	 *    	} [finally {
	 *    
	 *    	 	예외의 발생 유무와 상관없이 무조건 실행되는 코드 블록(생략 가능) 
	 *    
	 * 		}]
	 * 
	 * 
	 */

	public void method1() {
		
		try {

			int result = 10/0;
			System.out.println(result);

			// 멀티 캐치
		} catch (ClassCastException | ArithmeticException e) {
			System.out.println("ClassCastException 예외 혹은 ArithmeticException 예외가 발생했습니다.");
			
			// 다중 캐치 (아래로 캐치)
		} catch (Exception e) {
			
			System.out.println("오류가 발생했습니다.");
			System.out.println(e.getMessage());
		
		} finally {

			System.out.println("예외 발생 여부와 상관없이 무조건 수행되는 내용");
		}
	}
	
	
	
}
