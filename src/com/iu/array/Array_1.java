package com.iu.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		//변수 선언공식
		//데이터타입 변수명;
		//String  name;
		//Scanner sc;	//데이터 타입 뭔진모르지만 데이터타입이 scanner다
		
		
		//배열 선언
		//모을려고하는 데이터타입 [ ] 변수명 =new 모을려고하는 데이터타입[숫자]
		
		//int [] nums =10;	//nums의 데이터타입은 int인가? 아니다 why? 앞쪽에 [ ]가 있기때문에 정수를 담을 수 있어야하는데 담을 수 없다.
		int [] nums = new int[3];	//숫자부분엔 몇개의 데이터를 모으려고하는지 써넣으면 됨 정수형의 숫자를 넣어주면 됨
		//nums는 몇byte일까 4byte
		// new 라는 건 heap 메모리에 만들라는 것 new 하면 무조건 heap을 생각하세요.
		//heap메모리에 int 타입 4바이트를 3개(적힌 숫자만큼)를 연달아 만드세요 라는 뜻
		//만들어진 int 시작점의 주소를 nums에 담으세요라는 뜻 
		//실제 데이터는 heap에 있음 
		//레퍼런스 타입은 실제 데이터의 주소를 담고있음
		//모든 레퍼런스 타입은 4byte를 차지함
		
		int age =30;
		System.out.println(age);
		System.out.println(nums); //숫자가 나오지않음 [-배열이라는뜻 I-int라는 뜻 @ -구분자 37d31475 ==[I@37d31475
		
		char [] names = new char[2];
		names[0] = 'z';
		names[1] = '한';
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		nums[1] = age;	//age=30
		nums[2] = 50;
		nums[0] = 10;
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[0]);
		
		
		
		
		
		
	}

}
