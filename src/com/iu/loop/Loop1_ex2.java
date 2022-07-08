package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {

		//1. 1번 대문자 2번 소문자
		//	1번이면 A-Z출력
		//	2번이면 a-z출력
		
		//2. 1-10까지 의 합 구하기
		
		//3. ID,PW를 입력해서 로그인 판단
		//틀리면 ID,PW 입력 시키기
		//	최대 5번까지 시도 가능
		// 로그인 성공지 그 즉시 종료
		
		
		
		Scanner scan = new Scanner(System.in);
		
		//1번 문제
		System.out.println("1.대문자  2.소문자");
		int num = scan.nextInt();

		//a :65 z:90
		//A :97 Z:122 
		
//		int i=97;
//		int j=123;
//		
//		if(num==1) {
//			i=65;
//			j=91;
//		}
//		for(int c=i; c<j; c++) {
//			System.out.println((char)c);
//		}
		
		
		if(num ==1) {
			for(int c=65; c<91; c++) {
				System.out.println((char)c);
			}
		}else {
			for(int c=97; c <123; c++) {
			System.out.println((char)c);
			}
		}
		
		
		//2번 문제
		int total =0;
		for(int i=1; i<11; i++)	{
			total = total +i;
		}
		System.out.println(total);
		
		
		//3번
		int yId =1234;	//회원가입시 입력한 ID
		int yPw =5678;	//회원가입시 입력한 PW
		String yn = "";
		boolean check =false;
		int i=0;
		for( i=0; i<5; i++) {
			System.out.println("아이디를 입력해주세요.");
			int id = scan.nextInt();
			System.out.println("비밀번호를 입력해주세요.");
			int pw = scan.nextInt();
			
			if(id != yId || pw !=yPw ) {
				System.out.println("로그인 실패");
					yn= "로그인실패 5번을 초과하여 30분 후 다시 로그인해주세요.";
			}else {
				System.out.println("로그인 성공");
					yn="웅냥냥따리 로그인성공 홈으로 이동해주세요.";
					check=!check;
					i=5000;	//5이상의 숫자를 줘서 로그인 성공시 for문을 나갈수 있도록 i값을 설정해준.
					break;
			}
		}
		System.out.println("반복문 종료");
		System.out.println(yn);
		System.out.println(check);
		if(check) {
			System.out.println(check+"=게임 시작");
		}else {
			System.out.println(check+"은행 방문");
		}
		
			
		
		//1. 로그인이 성공했을 경우
		//2. 로그인이 5번 전부 실패했을 경우
		//for문 종료시 다르게 출력
		
		
		//3번
		//System.out.println("아이디를 입력해주세요.");
		//int id = scan.nextInt();
		//System.out.println("비밀번호를 입력해주세요.");
		//int pw = scan.nextInt();
		//int id=0;
		//int pw=0;
		
		
		/*for(int i=0; i<4; i++) {
			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
			}else {
			System.out.println("다시입력하세요");
			System.out.println("아이디를 입력해주세요.");
			id = scan.nextInt();
			System.out.println("비밀번호를 입력해주세요.");
			pw = scan.nextInt();
			System.out.println(i);
			}
			//System.out.println("출력 끝");
		}
		System.out.println("반복문 끝");*/
		
			/*if(id== 1234) {
				System.out.println("비밀번호를 입력해주세요.");
				int pw = scan.nextInt();
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			//if(pw ==5678) {
			//	System.out.println("로그인 성공");
			//}
				System.out.println("에반데 어디냐");
			System.out.println("ㅈㅈ");
		}
		System.out.println("문제실패");*/
	//아이디,비밀번호 입력을 한번에 해야하나? 일단 반복문 5번 돌리고 로그인 성공시 바로 종료
	
	}

}
