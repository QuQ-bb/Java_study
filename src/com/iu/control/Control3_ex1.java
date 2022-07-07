package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		//국어, 영아, 수학 입력
		//총점 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외는 F
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어성적을 입력해주세요.");
		int kor = scan.nextInt();
		System.out.println("영어성적을 입력해 주세요.");
		int eng = scan.nextInt();
		System.out.println("수학성적을 입력해 주세요.");
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		System.out.println("총점: "+total+ "평균: "+avg);
		
		if(avg >= 90) {
			System.out.println("A학점");
		}else if(avg >= 80) {
			System.out.println("B학점");
		}else if(avg >= 70) {
			System.out.println("C학점");
		}else if(avg >= 60) {
			System.out.println("D학점");
		}else if(avg<60){
			System.out.println("F학점");
		}
		
		
	}

}
