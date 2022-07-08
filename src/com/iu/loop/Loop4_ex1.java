package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {

		//시계문제 1분은 0-59초
		//0분 0초 부터 59분 59초
		
		//분과 초를 입력받기
		//ex) 1분 15초
		//for문 조건식 변경 불가
		//*주의점* : 안쪽 for문에서 break를 쓰면 해당 for문만 종료됨
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("분을 입력주세요.");
		int mm = scan.nextInt();
		System.out.println("초를 입력해주세요.");
		int ss = scan.nextInt();
		
		//이제 이걸 어케 쓰냐구 ㅇㅅㅇ 반복문이 잘 돌다가 멈추는거잖아 그럼
		//입력을 받기-그 후 반복문이 돌아감 - 해당 조건에 마주치면 반복문 종료
		//돌리다가~ 입력한 숫자를 만난다면 반복문 종료
		
		for(int m=0; m<60; m++) {
			
			for(int s=0; s<60; s++) {
				System.out.println(m+" 분 "+ s+" 초 ");
				if(mm==m && ss==s) {	//초가 지정된 분까지는 멈추지 않아야 한다.
					break;
				}
			}//안쪽 for
			if(mm==m) {
				break;
			}
		}//바깥 for
	}

}
