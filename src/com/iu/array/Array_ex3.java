package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적 프로그램
		//1.학생 정보 입력
		//	-학생 수를 입력
		//	-이름, 번호, 국어,영어, 수학 입력 후 계산 총점,평균
		//2.학생 정보 조회
		//	-모든 학생의 이름,번호,총점,평균 정보 출력
		//3.학생 정보 검색
		//	-검색할 학생의 번호를 입력
		//	-입력한 번호와 일치시 학생의 모든 정보를 출력
		//	-일치하는 번호가 없으면 없는 학생이다 출력
		//4.학생 정보 삭제
		//	-삭제할 학생의 번호를 입력합니다.
		//	-입력한 번호와 일치하는 학생의 정보를 삭제(배열을 한칸 줄이자는 말)
		//	-일치하는 번호가 없으면 없는학생이다 출력
		//5.학생 정보 추가
		//	-이름,번호,국어,영어,수학 입력 후 계산 총점 ,평균 추가
		//6.프록그램 종료
		
		//총 배열을 7개
		//이름,번호 국어,영어,수학,총점,평균
		
		Scanner scan = new Scanner(System.in);
		
		
		boolean check = true;
		String [] names = null;
		int [] studentNums = null;
		int[] kors =null;
		int[] engs = null;
		int[] maths = null;
		int[] total = null;
		double[] avgs = null;
		int nums=0;
		
		while (check) {
			
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로그램 종료");
			int studentInfo = scan.nextInt();
			
			
			switch(studentInfo) {
			case 1:
			
				System.out.println("학생수를 입력해주세요.");
				nums = scan.nextInt();
				names = new String[nums];
				studentNums = new int[nums];
				kors = new int[nums];
				engs = new int[nums];
				maths = new int [nums];
				total = new int[nums];
				avgs = new double[nums];
				
				
				for(int i= 0; i<names.length; i++) {
					System.out.println("학생 이름을 입력해주세요.");
					names[i] = scan.next();
					System.out.println("학생 번호를 입력해주세요.");
					studentNums[i] = scan.nextInt();
					System.out.println("국어 성적을 입력해주세요.");
					kors[i] = scan.nextInt();
					System.out.println("영어 성적을 입력해주세요.");
					engs[i] = scan.nextInt();
					System.out.println("수학 성적을 입력해주세요.");
					maths[i] = scan.nextInt();
					
					total[i] = kors[i]+engs[i]+maths[i];
					avgs[i] = total[i]/3.0;
					System.out.println(names[i]);
					System.out.println();
					System.out.println("총점점수:" +total[i]);
					System.out.println("평균점수:" +avgs[i]);
				}//for문
				
				
				break;
				
			case 2:
				
				//모든학생의 정보를 출력한다.
				for(int i=0; i<names.length; i++) {
					System.out.println("학생의 이름: "+names[i]+" 학생의 번호: "+studentNums[i]+" 국어성적: "+kors[i]+" 영어성적: "+engs[i]+" 수학성적: "+maths[i]+" 총점: "+total[i]+" 평균점수: "+avgs[i]);
				
				}
				break;
			case 3:
				System.out.println("검색할 학생의 번호를 입력해주세요.");
				int select =scan.nextInt();
				int index =0;
					for(int i=0; i<names.length; i++) {
						if(select == studentNums[i]) {
							index=i;
							System.out.println("학생의 이름: "+names[index]+" 학생의 번호: "+studentNums[index]+" 국어성적: "+kors[index]+" 영어성적: "+engs[index]+" 수학성적: "+maths[index]+" 총점: "+total[index]+" 평균점수: "+avgs[index]);
						}else{
							System.out.println("입력한 번호의 학생 정보가 존재하지 않습니다.");
							break;
						}
					}
				break;
			case 4:
				System.out.println("정보를 삭제할 학생의 번호를 입력해주세요.");
				int delete = scan.nextInt();
				int [] copy = new int[names.length-1];
				
				
				
				//번호가 일치하지않으면 없는학생이라고 출력
				
				
				break;
			case 5:
				System.out.println("추가할 학생의 이름을 입력해주세요.");
			case 6: 
					System.out.println("프로그램을 종료합니다.");
					//프로그램 종료
			
			}//switch
			
		}//while
		
		
	}

}
