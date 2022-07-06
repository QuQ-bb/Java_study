package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {

		//키보드로부터 국어,영어,수학 점수를 차례로 입력
		//총점과 평균을 계산
		//평균 90점 이상이면 우등상 수상 출력
		//모든 학생들은 졸업출력
		
		//2.평균이 90점 이상이면 A학점 출력
		//  평균이 80점 이상이면 B학점 출력
		//  평균이 70점 이상이면 C학점 출력
		//  평균이 60점 이상이면 D학점 출력
		//  그외 나머지 F학점 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요.");
		int kor = scan.nextInt();
		System.out.println("수학점수를 입력해주세요.");
		int math = scan.nextInt();
		System.out.println("영어점수를 입력해주세요.");
		int eng = scan.nextInt();
		
		int total = kor + math + eng;
		
		if(total/3 >= 90) {
			System.out.println("우등상 수상");
		}
		System.out.println("축 졸졸업");
		System.out.println("총점 :"+total+" 평균 :"+(double)total/3);
		
		if(total/3 >= 90 ) {
			System.out.println("A");
		}
		if(total/3 < 90 && total/3 >= 80) {
			System.out.println("B");
		}
		if(total/3 < 80 && total/3 >= 70) {
			System.out.println("C");
		}
		if(total/3 < 70 && total/3 >= 60) {
			System.out.println("D");
		}if(total/3 < 60) {
		System.out.println("F");
		}
		
		if(total/3 >= 90) {
			System.out.println("A학점");
		}else if(total/3 >= 80) {
			System.out.println("B학점");
		}else if(total/3 >= 70) {
			System.out.println("C학점");
		}else if(total/3 >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
	}

}
