package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		
		//ID,PW입력받기
		//로그인 판단 로그인이 성공하면 종료
		//실패하면 다시 입력
		
		int id=0;
		int pw=0;
		boolean log = true;
		
		
//		while(log) {
//			System.out.println("1.로그인을 하시겠습니까? 2.아니요");
//			int check = scan.nextInt();
//			if(check ==1) {
//				System.out.println("아이디를 입력해주세요.");
//				id = scan.nextInt();
//				System.out.println("비밀번호를 입력해주세요.");
//				pw = scan.nextInt();
//				if(yId==id && yPw==pw){
//					System.out.println("로그인에 성공하셨습니다.");
//					log = !log;
//				}else {
//					System.out.println("로그인에 실패하였습니다.");
//				}//else
//			}else {
//				System.out.println("로그인 시도를 중단하였습니다.");
//				break;
//			}
//		}//while
		
//		System.out.println("강사님 코드======================================");
//		while(log) {
//			System.out.println("1.로그인을 하시겠습니까? 2.아니요");
//			int check = scan.nextInt();
//			switch(check) {
//			case 1:
//				System.out.println("아이디를 입력해주세요.");
//				id = scan.nextInt();
//				System.out.println("비밀번호를 입력해주세요.");
//				pw = scan.nextInt();
//				if(yId==id && yPw==pw){
//					System.out.println("로그인에 성공하셨습니다.");
//					log = !log;
//					System.out.println("게임을 시작합니다.");
//				}else {
//					System.out.println("로그인에 실패하였습니다.");
//				}//else
//				break;
//				default:
//					log=!log;
//					System.out.println("로그인 시도를 중단하였습니다.");
//			}//switch
//		}//while
		
//=====================================================================
		//로그인을 안했으면 프로그램이 종료
		//로그인에 성공했으면 게임 시작
		//게임 시작 후 사냥 하런지 종료할껀지 선택
		//RPG게임 
		//시작레벨은 1
		//만렙 	 15
		//GOLD :1000 갖고있음
		//모든 몬스터의 경험치는 동일 몬스터사냥 수: 시작레벨 < 만렙
		//레벨 1 -> 레벨 2 : 몬스터 3마리
		//레벨 2 -> 레벨 3 : 몬스터 6마리
		//레벨 3 -> 레벨 4 : 몬스터 9마리
		//레벨 4 -> 레벨 5 : 몬스터 12마리
		//...
		//레벨 14 -> 레벨 15 : 몬스터 ? 마리
		//레벨 5 달성 시 축하금 1000GOLD 지급
		//레벨 10 달성 시 축하금 2000GOLD 지급
		//레벨 15 달성 시 축하금 3000GOLD 지급
		//최종 7000GOLD 있어야함
		
		//System.out.println("몬스터 N마리 사냥");
		//System.out.println("축 레벨업");
		
		//1.로그인 여부
		//2.시작레벨은 1로 주고 GOLD는 1000
		//사냥 여부
		//레벨업할때마다 사냥 여부 묻기
		//3.몬스터 사냥 : 몬스터를 N마리 사냥
		//-- 1 ->3
		//-- 2 ->6
		//-- 3 ->9
		//--...
		//-- 15->45
		//일단 그럼 레벨 15까지 반복문 돌리기
		//레벨에 맞는 몬스터 수를 반복문 돌리기
		
		//4.레벨업시 레벨을 올려주고 : 축 레벨업
		//5.레벨5,10,15를 달성시 GOLD를 지급
		//레벨 15달성 시 만렙입니다 출력
		
		yId = 1234;
		yPw = 5678;
		id=0;
		pw=0;
		log = true;
		int level =1;
		int monster =0;
		int gold =1000;
		String end = "정상레벨에 도착하였습니다.";
		
		while(log) {
			System.out.println("1.로그인을 하시겠습니까? 2.아니요");
			int check = scan.nextInt();
			switch(check) {
			case 1:
				System.out.println("아이디를 입력해주세요.");
				id = scan.nextInt();
				System.out.println("비밀번호를 입력해주세요.");
				pw = scan.nextInt();
				if(yId==id && yPw==pw){
					System.out.println("로그인에 성공하셨습니다.");
					log = !log;
					System.out.println("게임을 시작합니다.");
					
					for(level=1; level<15; level++) {
						if(level%5==0) {
							System.out.println("축 "+level+ "레벨  축하금"+gold+"를 지급합니다.");
							gold = gold+((1000)*level/5);
							System.out.println("총 보유GOLD: "+gold);
						}//레벨 포상금 지급if
						System.out.println(yId+"님 레벨은 "+ level+"입니다."+"보유 GOLD: "+gold);
						System.out.println("1.몬스터 사냥을 시작하시겠습니까? 2.게임 종료");
						int sn = scan.nextInt();
						//만약 sn ==1 이라면 사냥 시작 sn==2 게임종료
						
						if(sn==1) {
							for(monster=0; monster<level*3; monster++) {
								System.out.println("몬스터" +(monster+1)+"마리 를 사냥");
							}//monster for문
							System.out.println("축 "+(level+1)+"레벨!");
						}else {
							end="게임을 종료하였습니다.";
							break;
						}
					}//level for문
					System.out.println(end);
					//끝을 낼때 게임종료 버튼을 눌러서 종료하는건지 
					
				}else {
					System.out.println("로그인에 실패하였습니다.");
				}//else
				break;
				default:
					log=!log;
					System.out.println("로그인 시도를 중단하였습니다.");
			}//switch
		}//while
		
		
		System.out.println("강사님 코드============================================================");
//		log=true;
//		boolean flag= false;	//로그인 성공시 log를 false로 만들어버려서 
//		
//		while(log) {
//		System.out.println("1.로그인을 하시겠습니까? 2.아니요");
//		int check = scan.nextInt();
//		switch(check) {
//		case 1:
//			System.out.println("아이디를 입력해주세요.");
//			id = scan.nextInt();
//			System.out.println("비밀번호를 입력해주세요.");
//			pw = scan.nextInt();
//			if(yId==id && yPw==pw){
//				System.out.println("로그인에 성공하셨습니다.");
//				log =!log;
//			}else {
//				System.out.println("로그인에 실패하였습니다.");
//			}//else
//			break;
//			default:
//				log=!log;
//				System.out.println("로그인 시도를 중단하였습니다.");
//		}//switch
//	}//while
//		if(!flag) {
//			System.out.println("게임을 시작합니다.");
//			int level =1;
//			int gold =1000;
//			
//			for(level=1; level<15; level++) {
//				if(level%5==0) {
//					gold = gold+(level/5*1000);
//				}
//				
//				for(int mon=0; mon<3*level; mon++) {
//					System.out.println(mon+1+"꽥");
//				}
//				System.out.println("==============");
//			}
//			System.out.println("최종레벨: "+level);
//			System.out.println("최종gold: "+gold);
//		}
//		System.out.println("flag=="+flag);
//		System.out.println("프로그램을 종료 합니다.");
	}

}
