package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		//random.nextInt(30);	//0~30까지  숫자를 넣으면 0부터 내가 넣은 숫자까지 랜덤수 돌리기
		
		//몬스터 기본정보
		String [] monsterNames= {"고블린","오크","트롤","골렘"};
		int [] monsterHps = {5,7,10,15};
		
		//캐릭터 이름 설정
		System.out.println("캐릭터 이름입력");
		String name = scan.next();
		
		
		//파이어볼
		int magicPower=6;
		
		
		//몬스터 파티를 생성
		//1.몬스터 수를 입력받습니다(1~4)
		//랜덤으로 몬스터 한마리 뽑아옴
		//hp랜덤생성해서 5~10사이로 뽑아옴 (5~10)
		
		System.out.println("1~4마리의 몬스터의 수를 입력해주세요");
		int num = scan.nextInt();
		
		//입력받은만큼의 몬스터를 랜덤으로  뽑아온다.
		//수를 입력받으면
		//그 수만큼을 출력해야돼
		//숫자를 String 으로
		
		
		//입력받을 수만큼 랜덤으로 몬스터를 생성한다.
		//생성된 몬스터 파티의 배열을 선언해준다.
		String [] monsterPartyNames = new String[num];
		//파티에 들어간 몬스터의 hp를 받을수 있는 배열 생성  
		int [] monsterPartyHps = new int[monsterPartyNames.length];
		for(int i=0; i<monsterPartyNames.length; i++) {
			int index= random.nextInt(4);
			monsterPartyNames[i] =monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
			//System.out.println(monsterNames[i]);
		}
		
		//몬스터이름 출력
		for(int i=0; i<monsterPartyNames.length; i++) {
			System.out.println(monsterPartyNames[i]+"  :  "+monsterPartyHps[i]);
		}
		
		//1회성 공격
		//0-6미만의 랜덤한 데미지로 몬스터를 공격(광역 공격)
		//전부 데미지를 다르게 줌 랜덤 수를 몬스터 수만큼
		//1.사냥 2.도망
		
		
		//그럼 일단 공격을 할수 있어야함 
		//파이어볼로 공격을하면 0-6미만의 랜덤한 데미지로 몬스터의 hp를 깍는다
		
		//사망시키기
			boolean check = true;
			while(check) {
				System.out.println("1.사냥 2.도망");
				int run = scan.nextInt();
				int death =0;
				
				if(run==1) {
					for(int i=0; i<monsterPartyNames.length; i++) {
						int damage = random.nextInt(magicPower);
						monsterPartyHps[i] = monsterPartyHps[i]-damage;
						//magicPower = random.nextInt(6);
						//monsterPartyHps[i] -= magicPower;
						System.out.println(monsterPartyNames[i]+"에게 데미지 "+damage+"를 입었습니다.");
						if(monsterPartyHps[i]<1) {
							death +=1;
						}
					}//for문
				}else {
					System.out.println("몬스터에게서 도망칩니다.");
					break;
				}//else
				System.out.println("사냥한 몬스터 수 :" +death);
			}//while문
		
		
		
		//System.out.println("magicPower="+magicPower);
		
		
		
		
		
		//인원수를 입력받기
		//인원수 만큼 이름을 입력 받기
		//이름들을 출력
		
//		System.out.println("인원수를 적어주세요.");
//		int num2 = scan.nextInt();
//		
//		String [] names = new String[num2]; 
//		for(int i=0; i<names.length; i++) {
//			System.out.println("학생의 이름을 입력해주세요.");
//			names[i] = scan.next();
//		}
//		//학생이름 출력
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		
		
		
		
		
		

	}

}
