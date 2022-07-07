package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		int num =10;	//지역변수
		//지역변수는 메소드안에서 사용 가능
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1-3 숫자를 입력하세요.");
		int select = scan.nextInt();
		
		if(select == 1) {
			int count =1;//지역변수: 그 영역 안에서 선언되는것 그 영역이 끝나면 메모리에서 같은 삭제됨
			System.out.println("1선택");
		}else if(select ==2) {
			int count =1;//지역변수 //1에도 있지만 그건 1일때 선언되는거기때문에 중복되지않는다.
			System.out.println("2선택");
		}else if(select ==3) {
			int count =1;//지역변수
			System.out.println("3선택");
		}else {
			System.out.println("선택사항에 없습니다.");
		}
		
		//System.out.println(count); //if문안의 count를 출력하려면 오류남 why? { }안에서 선언됐기때문에 { }가 끝나면 같이 메모리가 삭제되어 없어짐
		//지역변수의 특징 : 메소드가 실행되면 만들어졌다가 영역이 끝나면 메모리를 삭제해서 같이 사라짐
		//지역변수 : 메소드안에 선언된것, 메소드안의 { }안에 선언된 것
	}

}
