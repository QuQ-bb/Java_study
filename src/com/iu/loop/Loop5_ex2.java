package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
//		nextInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아줌
		
//		int num =random.nextInt(10);	//숫자를 넣으면 0부터 넣은 숫자사이의 숫자가 나온다 0-9 
//		System.out.println(num);
		
		//0 : 가위
		//1 : 주먹
		//2 : 보
		//사용자가 하나를 입력
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길경우만 종료
		//비기거나 지면 다시 실행
		
		//순서
		//1.사용자가 가위바위보 중 하나를 입력한다.
		//2.컴퓨터가 랜덤의 가위바위보 숫자를 출력
		
		//지는 경우 : 가위 > 보  0>2
		//		 : 보 > 주먹   2> 1
		//		 : 주먹 > 가위 1 > 0
		
//		boolean rsp = true;
//		
//		while(rsp) {
//			System.out.println("0.가위 1.주먹 2.보");
//			int num = scan.nextInt();
//			int smith =random.nextInt(3);
//			System.out.println(smith);
			
			//String win = "이겼습니다.";
			//이기는 경우
			//num = 0 일떄 
			//smith = 2 
			//0-2 =-2
			//num = 1 일때
			//smith = 0
			//1-0 =1
			//num =2 일때
			//smith 1
			//2-1 1
			
			//지는 경우
			//num =0
			//smith = 1
			// 0-1 =-1
			
			//num=1 
			//smith =2
			//1-2 -1
			//num=2
			//smith =0
			//2-0 2
//			if(num-smith == -1 || num-smith==2) {
//				System.out.println("졌습니다.");
//			}else if(num == smith) {
//				System.out.println("비겼습니다.");
//			}else if(num-smith==1 || num-smith==-2){
//				System.out.println("이겼습니다.");
//				break;
//			}else {
//				System.out.println("숫자를 다시 입력해주세요");
//			}
			
			
			//System.out.println("==================실패작=========================");
//			boolean lose = true;
//			
//			if(num==0) {
//				lose= smith == 0 || smith==2;
//			}else if(num ==1) {
//				lose = smith == 1 || smith ==0;
//			}else if(num ==2) {
//				lose = smith ==2 || smith ==1;
//			}else {
//				System.out.println("이겼습니다.");
//				lose=!lose;
//				break;
//			}
//			System.out.println("lose= "+lose);
			
			//System.out.println("==================내코드=============================");
			
//			if(num== 1  && smith == 0) {
//				System.out.println("이겼습니다.");
//				break;
//			}else if(num ==2 && smith == 1) {
//				System.out.println("이겼습니다.");
//				break;
//			}else if(num ==0 && smith == 2) {
//				System.out.println("이겼습니다.");
//				break;
//			}else{
//				System.out.println("게임을 다시 시작합니다.");
//			}
			
			System.out.println("강사님 코드===================================");
			boolean check =true;
			while(check) {
				System.out.println("0.가위 1.주먹 2.보");
				int you =scan.nextInt();
				int com =random.nextInt(3);
				System.out.println("you : "+you+"--com : "+com);
				com=0;
				if(com==0&& you ==2) {
					you =-1;
				}
				if(com==2&&you==0) {
					com=-1;
				}
				
				if(com<you) {
					System.out.println("You Win");
					check=!check;
				}else if(com == you) {
					System.out.println("Even");
				}else {
					System.out.println("Com Win");
				}
			}
			
			
			
		
			
//		}//while
		
		
		
	}

}
