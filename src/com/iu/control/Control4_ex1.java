package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해 주세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력해 주세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력해 주세요.");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		int avg = (total/3)/10;	//정해진 숫자를 넣어줬어야 하기때문에 10의 자리수만 뽑아서 넣어줌
		String grade ="";
		
		System.out.println("총점: "+ total );
		
		switch(avg) {
		case 9: case 10:
			grade="A학점";
			break;
		case 8:
			grade="B학점";
			break;
		case 7:
			grade="C학점";
			break;
		case 6:
			grade="D학점";
			break;
		default:
			grade="F학점";
		}
		
		System.out.println(grade);
		
		
		//변수가 아니라 정수식 또는 문자열
		
	}

}
