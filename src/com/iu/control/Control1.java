package com.iu.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {

		//제어문
		//1.단일 if
		//조건식 : 어떤식을 만들든 결과가 true 나 false가 나오게 함
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num =scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num+"은(는) 짝수입니다.");	//출력문이 하나일때는 { } 생략 가능합니다.
		}												//{ } 생략 후엔 바로 아래 한줄만 true로 인식
		
		if(num<10) {
			System.out.println(num + "은(는) 10 미만임");
		}
		
		System.out.println("Finish");
	}

}
