package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//월급을 입력받기
		//1. 정규직 2. 계약직 1 or 2입력받기
		//정규직이면 -국민연금 월급의 1%, 건강보험 월급 1.4% ,고용보험 월급 0.5%,산재보험 월급의 0.7% 
		//계약직이면 월급의 3.3%
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("월급을 입력해주세요.");
		int sal = scan.nextInt();
		System.out.println("정규직이면 1번, 계약직이면 2번을 입력해주세요.");
		int num = scan.nextInt();
		
		if(num == 1) {
			sal = (int)(sal*(1 - ( 0.01+ 0.014 + 0.005 + 0.007))) ;
			//int tax1 =(int)(sal*0.01);
			//int tax2 =(int)(sal*0.014);
			//int tax3 =(int)(sal*0.005);
			//int tax4 =(int)(sal*0.007);
			//sal = sal -tax1 -tax2 -tax3 -tax4;
			System.out.println("정규직입니다.");
			System.out.println("당신의 월급은 " +sal +"원 입니다.");
		}else {
			sal = (int)(sal*(1 - (0.033)));
			//int tax = (int)(sal*0.033);
			//sal = sal-tax;
			System.out.println("계약직입니다.");
			System.out.println("당신의 월급은 " +sal+"원 입니다.");
		}
		
	}

}
