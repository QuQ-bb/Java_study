package com.iu.array;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {

		//배열하고 for문이 잘 맞음 why?횟수가 정해져 잇기때문에
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[1];
		
		for(int i =0; i<nums.length; i++) {
			System.out.println(i+"번 인덱스 값 입력");
			nums[i]=scan.nextInt();
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
