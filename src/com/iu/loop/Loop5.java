package com.iu.loop;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {

		//while는 거의 무한으로 돌릴 때 많이 사용한다.
		
		Scanner scan = new Scanner(System.in);
		
		boolean check =true;
		
		while(check) {
			System.out.println("1.성적입력");
			System.out.println("2.총점계산");
			System.out.println("3.평균계산");
			System.out.println("4.프로그램 종료");
			int select = scan.nextInt();
			
			if(select ==1) {
				System.out.println("성적입력을 선택했습니다.");
			}else if(select ==2) {
				System.out.println("총점계산을 선택했습니다.");
			}else if(select ==3) {
				System.out.println("평균계산을 선택했습니다.");
			}else if(select==4){
				System.out.println("프로그램 종료를 선택했습니다.");
				check=!check;
				break;
				//check=false;
			}else {
				System.out.println("1-4번만 선택가능합니다.");
			}
		}
		
		
		
//		int i=0;
//		while(i<5) {
//			System.out.println("Hello World");
//				i++;
//		}
	}

}
