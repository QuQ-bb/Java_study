package com.iu.array;

public class Array_6 {

	public static void main(String[] args) {
		//배열의 길이 변경
		//애초에 만들어진 배열의 길이를 변경하는건 불가
		
		int[] nums = {1,2,3};
		System.out.println(nums.length);		//3
		//깊은 복사
		int [] copy = new int[nums.length-1];
		for(int i=0; i<copy.length; i++) {
			copy[i] =nums[i];
		}
		
		nums= copy;
		
		System.out.println(nums.length);	//2
		
		//nums를 돌려서 1,2만 나오게 하고싶다
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(copy[i]);
//		}
		
	}

}
