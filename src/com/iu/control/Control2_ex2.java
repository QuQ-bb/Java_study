package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//숫자 1이 조건일때 a를 입력하면 b
		//숫자 1이 조건일때 b를 입력하면 c
		//숫자 2이 조건일때 b를 입력하면 d
		//숫자 2이 조건일때 d를 입력하면 f
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1-5 사이의 숫자 입력");
		int num = scan.nextInt();
		System.out.println("알파벳을 입력");
		char ch = scan.next().charAt(0);
		
		System.out.println("입력한 숫자"+num);
		
		ch = (char)(ch+num);
		System.out.println("ch :" + ch);
		
		num = num + ch;	// a=97 b=98 c=99
		//됐는데..위치변경까진 됐는데...숫자를 문자로 변환해야 함
		char cc = (char)num;		
		//숫자를..char타입으로 변경.. 이걸 어케if문으로 쓰나요 강사님..
		
		//숫자 1이 입력되었을때는 문자 a가 문자b로 출력 될수있게 출력하기
		System.out.println("입력한 알파벳"+ch);
		System.out.println("입력한 알파벳을 숫자로 변환한 값 " +num);
		System.out.println("출력된 숫자를  문자로 변환한 값 " + cc);
		// => num:1 출력:b 
		// => num:2 출력:c
		
		
	}

}
