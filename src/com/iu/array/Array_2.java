package com.iu.array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		//배열은 어떤 데이터타입이든 상관x
		//모을려고하는 데이터타입 [] 변수명 = new 모을려고하는 데이터타입[갯수]
		String[] names = new String[3];
		//names[0] ="iu";
		//names[1]="choa";
		//names[2] ="suji";
		//names[3] ="";	//names에는 index번호 3번이 존재하지않지만 오류나지않음 but 실행하면 오류발생 
		
		int[] nums = new int[3];	//초기화 : 선언된 변수에 최초로 값을 넣는것
		//지역변수는 선언 후 사용하려면 초기화 해야한다. 하지않으면 오류발생
		//초기화하지않은 변수는 사용하려면 오류발생
		
		System.out.println(nums[0]);	//값이없음 하지만 오류가 발생하진않음
		//heap영역에 선언된 변수는 별도의 지시가 없으면 자동으로 초기화를 진행
		//자동으로 초기화 될 때는 각 타입에 맞는 초기값이 대입됨
		
		System.out.println(names[0]);	//참조타입은 초기값으로 null이 들어감
		Scanner[] sc = new Scanner[2];
		
		//이런식도 잇음!!
		//모으려고하는 데이터타입 [] 변수명 = {값1,값2,값3..};
		//보통 테스트용으로 사용하고 잘 사용하지않음
//		int [] nums2 = {1,4,52};
//		System.out.println(nums2[0]);
//		System.out.println(nums2[1]);
//		System.out.println(nums2[2]);
		
		//이런식의 식도 사용가능
		//int nums3 [];
 	}

}
