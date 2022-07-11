package com.iu.array;

public class Array_3 {

	public static void main(String[] args) {

		int [] nums= new int[3];
		nums[0]=100;	//int타입
		nums[1]=200;
		nums[2]=300;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		int[] nums2 = nums;
		System.out.println(nums2[0]);
	}

}
