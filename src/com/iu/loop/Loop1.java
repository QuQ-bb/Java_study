package com.iu.loop;

public class Loop1 {

	public static void main(String[] args) {

		System.out.println("Start");
		
		//for(초기식;조건식;증감식){}
		//초기식에 int만 가능
		for(int i=0; i<5; i++) { //증감식 i++ = i=i+1
			System.out.println("Hello World");
		}
		
		for(int i=0; i<10;i++) {
			System.out.println(i);
			//System.out.println(i++);
		}
		int count =0;
		for(int i=0; i<10;i++) {
			System.out.println(count);
			count++;
			//System.out.println(count++);
		}
		
		
		System.out.println("Finish");
	}

}
