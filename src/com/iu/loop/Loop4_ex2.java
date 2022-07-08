package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {

		//FPS
		//총알 :
		//탄창 :30발 ,3개 (1탄창 30발)
		
		//1.단발("탕") 2.점사(3발씩)("탕탕탕")
		//탄창을 다 쓴다면 다시 선택하기
		
		//단발/점사 입력받기
		//1.단발일때는 1개의 탄창에서 30발을 30번 쏴야한다. "탕"이 30줄 출력 될 수 있도록
		//2.점사일때는 1개의 탄창에서 30발을 3발씩 나가기 때문에 "탕탕탕"이 10줄 출력
		//그리고 다시 입력받기
		
		Scanner scan = new Scanner(System.in);
		
//		for(int t=0; t<3; t++) {
//		System.out.println("1.단발 2.점사 번호를 입력해주세요.");
//		int num= scan.nextInt();
//		
//		if(num==1) {
//			for(int a=0; a<30; a++) {
//				System.out.println("탕"+a);
//			}//num =1일때 for문 끝
//		}else {
//			for(int b=0; b<10; b++) {
//				System.out.print("탕탕탕"+b);
//				System.out.println();
//			}//num=2일때 for문 끝
//		  }//else if끝
//		}//t for문 끝
//		System.out.println("탄창을 다 소비하였습니다.");
		
		System.out.println("강사님 코드===========================");
		
			//증감식 변경
		for(int mag=0; mag<3; mag++) {
			System.out.println("1.단발 2.점사");
			int select =scan.nextInt();
			
			int inc =3;
			String sound ="타타탕";
			if(select==1) {
				inc =1;
				sound="탕";
			}
			for(int b=0; b<30; b=b+inc) {
				System.out.println(sound);
			}
			
			System.out.println("두번째 코드=============================");
			
			//조건식 변경
//			int count =10;
//			String sound ="타타탕";
//			
//			if(select==1){
//				count=30;
//				sound ="탕";
//			}for(int b=0; b<count; b++) {
//				System.out.println(sound);
//			}
			
			System.out.println("세번째 코드===================================");
			
			
//			if(select ==1) {
//				for(int b=0; b<30; b++) {
//					System.out.println("탄창: "+(mag+1)+" 총알: " +b+" 탕");
//				}
//			}else {
//				for(int b=0; b<10; b++) {
//					System.out.println("탄창: "+(mag+1)+" 총알: " +b+" 탕탕탕");
//		}//b-for
//	}//else
  }//for		
		
		
}//main
}//class
