package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean,math,english,total;
		int subnum=0;
		String highscore;
		
		System.out.println("[[성적 집계: 평균과 총점 구하기]]");
		System.out.println("성적을 입력하세요.");
		System.out.print("국어점수>>>");
		korean = sc.nextInt();
		subnum++;
		
		System.out.print("수학점수>>>");
		math = sc.nextInt();
		subnum++;
				
		System.out.print("영어점수>>>");
		english = sc.nextInt();
		subnum++;
		
		total = korean+math+english;
		
		System.out.println(">>처리되었습니다.");
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %d (%.2f), 과목수: %d\n",total/3, (double)total/3, subnum);
		
		if(korean>math && korean>english) {
			highscore="국어";
		}else if(math>korean && math>english){
			highscore = "수학";
		}else if(english>korean && english>math) {
			highscore = "영어";
		}else {
			highscore = "없음";
		}
		System.out.printf("이 학생의 특기과목은 .%s. 입니다.",highscore);
	}
}
