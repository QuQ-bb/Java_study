package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		
		String odd = "홀수입니다.";
		
		if(num%2 == 0) {
			odd= "짝수입니다.";
		}
		
		//odd = num%2 ==0 ? "짝수입니다.":"홀수입니다.";	//삼항연산자로 푸는 방법
		
		System.out.println(odd);
	}

}
