package com.iu.loop;

import java.util.Scanner;

public class Loop1_Ex1 {

	public static void main(String[] args) {

		//0-9 출력하는 반복문	//아래처럼 했으면 애초에 0-9까지 전부 돌지않음
		//단, 출력은 짝수만 출력
		
		for(int i=0; i<10; i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
		System.out.println("test2=======");
		//0-9 사이의 짝수만 반복문
		//단, if문을 사용하지 않고 출력
		System.out.println("별코드=============");
		for(int i=0; i<10; i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("강사님============");
		for(int i=0; i<10; i++) {
			System.out.println(i);
			i++;
		}
		
		//멍멍 출력
		//출력하는 횟수를 입력 받아서 그 획수만큼 출력
		Scanner scan = new Scanner(System.in);
		
	      System.out.println("출력하는 횟수를 입력해주세요.");
	      int  n= scan.nextInt() ;
	      
	      for (int i = 0; i < n ; i++ ) {
	         System.out.println("멍멍");
	      }
		
		//for(int i=0; i; i++) {
		//	System.out.println("멍멍");
		//}
		
		
	}

}
