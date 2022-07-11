package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		//키보드부터 인원수를 입력받아서
		//인원수 만큼 이름을 입력 받아서
		//이름들을 출력
		
		//1.인원수를 입력받기
		//2.배열선언
		//2-1.인원수만큼 이름 입력받기(for문 사용)
		//3.이름 인원수만큼 출력(for문 사용)
		
		//인원수를 입력받고
		//학생을 입력받기 전 인원수 만큼의 학생의 이름이 들어갈수 있는 배열을 선언해주어야한다
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수를 적어주세요.");
		int num = scan.nextInt();
		
		String [] names = new String[num]; 
		int [] kors = new int[names.length];
		
		for(int i=0; i<names.length; i++) {
			System.out.println(i+1+"이름을 입력해주세요.");
			names[i]= scan.next();
		}
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//각 학생의 이름별로 국어점수를 입력 후 출력
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+"의 국어점수를 입력해주세요.");
			kors[i] = scan.nextInt();
		}
		for(int i=0; i<kors.length; i++) {
			System.out.println(names[i]+"의 국어점수 "+kors[i]);
		}
	
		//반의 국어 총점을 계산하고 출력
		//인원수만큼의 국어 전체 점수 더하기
		int total=0;
		for(int i=0; i<names.length; i++) {
			total = total + kors[i];
		}
		System.out.println("반의 국어 총점은: "+total);
		
		
		
	}

}
