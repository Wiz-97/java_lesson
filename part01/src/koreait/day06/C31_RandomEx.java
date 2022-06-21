package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
public static void main(String[] args) {
	/*
	 * 학생 성적(국어) 분포 보고서를 만듭니다.
	 * 학생 인원은 100명 - 점수는 랜덤값으로 테스트(0<=난수<=100)합니다.
	 * 
	 * 90~100: O명(비율 %)			카운트 변수 5개 필요(cntA,B,C,D,E)
	 * 80~89									ㄴcounts[5]:counts[0],counts[1],...
	 * 70~79
	 * 60~69
	 * 60 미만
	 */
	Random r = new Random();
	int[] korean = new int[100];
	int[] counts = new int[5];
	
	for(int i = 0; i < korean.length; i++) {
		korean[i] = r.nextInt(101);
	}//국어 점수 저장
	
	//점수 분포 count하기
	for(int i=0;i<korean.length; i++) {
		if(korean[i]>=90) {
			counts[0]++;
		}else if(korean[i]>=80) {
			counts[1]++;
		}else if(korean[i]>=70) {
			counts[2]++;
		}else if(korean[i]>=60) {
			counts[3]++;
		}else{
			counts[4]++;
		}
	}
	
	//점수 분포 결과 출력하기 
	System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
//	System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60미만");
	System.out.println("------------------------------------------------------------------------");
	for(int i = 0; i < counts.length; i++) {
		System.out.printf("%2d명\t", counts[i]);
	}
	
	System.out.println();
	for(int i = 0; i < counts.length; i++) {
		System.out.printf("%.1f%%\t", (double)counts[i]/korean.length*100);
	}
}


//배열에서 기능이 향상(데이터 삭제/삽입, 크기도 동적으로 변경)된 것이 자바 ArrayList
//배열에서는 직접 데이터 삽입/삭제를 구현 -> 메소드 정의
}
