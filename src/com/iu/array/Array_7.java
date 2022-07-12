package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {

		int [] ar = {4,7,1,3,9};
		//높은숫자부터 낮은숫자로 나오는것 : 내림차순
		//낮은숫자부터 높은숫자로 나오는것 : 오름차순
		
		for(int i =0; i<ar.length-1; i++) {	//왜 4번 돌아? 데이터가 5개기때문에  (배열의 크기-1)하면 되는듯
			
			for(int j=1+i; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					int tmp =ar[j];
					ar[j] = ar[i];
					ar[i] = tmp;
					
				}
			}
			//i=0	, 1234
			//i=1	, 234
			//i=2	, 34
			//i=3	, 4
		}
		
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
