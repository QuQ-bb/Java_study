package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {

		int[] nums1 = {1,2,3};
		System.out.println(nums1.length);
		//얕은 복사 : 해당배열의 주소를 복사하는 것
		//한쪽의 데이터를 바꾸면 같이 변경됨
		int[]nums2 = nums1;
		System.out.println(nums2.length);
		
		//깊은 복사
		//독립적인 데이터
		int[]nums3= new int[3];
		for(int i=0; i<nums1.length; i++) {
			nums3[i] = nums1[i];
			
		}
		System.out.println("nums3=="+nums3[0]);
		nums2[0] =9;
		System.out.println(nums1[0]);	//9

		//nums3[0]=100;
		//System.out.println(nums1[0]);	//9
		//num3은 값을 복사한거지 주소를 복사한게 아니기 때문에 주소로전달되어 값이 변하지않는다
		
		System.out.println(nums3.length);	//3
		nums3 = new int[5];			//새로운 배열을 담은것. 5
		System.out.println(nums3[0]);
	}

}
