package com.kh.star;

import com.kh.star.practice.star;

public class Application {
	
	public static void main(String[] args) {
		
/*		   
		*               // 1행 :  공백 7개 + 별 1개
	   ***				// 2행 :  공백 6개 + 별 3개
      *****             // 3행 :  공백 5개 + 별 5개
 ****************       // 4행 :  별 16개
   ************         // 5행 :  공백 2개 + 별 12개
     ********           // 6행 :  공백 4개 + 별 8개
     ********           // 7행 :  공백 4개 + 별 8개
    ***    ***          // 8행 :  공백 3개 + 별 3개 + 공백 4개 + 별 3개  (공백 -1) (별 -5) (공백 + 4)
   *          *   		// 9행 :  공백 2개 + 별 1개 + 공백 10개 + 별 1개 (공백 -1) (별 -2) (공백 + 6)

*/

/*	
	
	for (int i = 1 ; i < 10 ; i++) {
		if (i < 4) {
			for(int j = 1 ; j < 9 - i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j < 2*i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}else if (i < 7) {
			for(int j = 1 ; j < (i - 3) * 2 - 1 ; j++ ) {
				System.out.print(" ");
			}
			for(int j = 1 ; j < 17 - (i - 4) * 4 ; j++) {
				System.out.print("*");
			} 
			System.out.println();
		} else {
			break;
			  }
	}

*/
	
/*

		 ****        // 1행 :  공백 4개 + 별 4 (-0)개 + 공백 0 (8 - 8)개
    ***          // 2행 :  공백 3개 + 별 3 (-1)개 + 공백 2 (8 - 6)개
	   *        	 // 3행 :  공백 2개 + 별 1 (-2)개 + 공백 5 (8 - 3)개

  for (int i = 1 ; i < 4 ; i++) {  	
	  // 열세기 변수
	  int col = 0;
	  // 초항이 0이고 공차가 -1인 등차수열의 합
	  int sum = i*((i - 1)*(-1)) / 2;
	  
	  if (col < 9) {
		  for (int j = 1; j < 5 - i; j++ ) { //공백 찍기
			  System.out.print(" ");
			  col++; 
		  } 
		  for (int j = 1; j < 5 + sum ; j++) { // 별 찍기
			  System.out.print("*");
			  col++; 
		  }          
       for (int j = 1; j < 8 - col ;j++ ) { //공백 찍기
    		System.out.print(" ");
    	   col++;
    	   }  
       System.out.println();

*/

/*		


****	         // 1행 :  공백 0 (6 - 6)개 + 별 4개 + 공백 2개
  ***            // 2행 :  공백 2 (6 - 4)개 + 별 3개 + 공백 1개
     *           // 3행 :  공백 5 (6 - 3)개 + 별 1개 + 공백 0개


*/
	
/*
		
  for (int i = 1 ; i < 4 ; i++) {  	
	  // 초항이 0이고 공차가 -1인 등차수열의 합
	  int sum = i*((i - 1)*(-1)) / 2;
	  // 공백을 먼저 찍기 위한 계산
	  int recol = sum + 3 - i;
	  
		  for (int j = 1; j < 5 - recol; j++ ) { //공백 찍기
			  System.out.print(" ");
		  } 
		  
		  for (int j = 1; j < 5 + sum ; j++) { // 별 찍기
			  System.out.print("*");
			  
		  }   
		  
		  for (int j = 1; j < 3-i ;j++ ) { //공백 찍기
			  System.out.print(" ");
    	  }  
		  
       System.out.println();
	 }
		 
*/
		new star().method1();
		
	}
}
