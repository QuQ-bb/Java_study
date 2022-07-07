package com.iu.control;

public class Loop3 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println("1.대문자, 2.소문자, 3.종료");
			int select = 1;
			switch(select) {
			case 1:
				System.out.println("대문자");
				break;	//반복문의 보조문이 아니라 switch case의 문법이기때문에 반복문이 종료되지않는다
			case 2:
				System.out.println("소문자");
				break;
			default :
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
