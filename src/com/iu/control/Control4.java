package com.iu.control;

public class Control4 {

	public static void main(String[] args) {

		//switch case	//다중 if문이랑 비슷함
		//switch(정수식 또는 문자열){
		//case 정수 또는 문자열 (상수형) :
		
		
		String select ="abc";
		
		switch(select) {
		case "aaa":
			System.out.println("1일때 코드 진행");
			break;
		case "abb":
			System.out.println("2일때 코드 진행");
			break;
		default:
			System.out.println("그 외 나머지");
			//제일마지막엔 break를 써도 되고 안써도 됨
			//default를 마지막에 쓸 필요는없다. 개발자의 의도에 의해 default를 안쓰기도함
		}
	}

}
