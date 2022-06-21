package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
	public static void main(String[] args) {
		
		String message = "hi java!";//message는 참조형 변수
		
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char 배열에서는 요소를 나타내는 nums[2], carr1[2], point[2]
												//ㄴ 기본형 데이터 타입
		//engKey 뿐만 아니라 engKey[2]도 String 참조형 타입
		
		for(int i=0; i<engKey.length; i++) {
			System.out.println(engKey[i]);
		}
		
		String[] koreans = new String[5];//배열 요소의 값이 기본형데이터 저장X, 참조값 저장
										//기본 초기값 null(아무것도 참조하지 않은 상태)
		for(int i=0; i<koreans.length; i++) {
			System.out.println(koreans[i]);
		}
		
		System.out.println("1. engKey 배열요소값이 참조하는 문자열의 길이");
		for(int i=0; i<engKey.length; i++) {
			System.out.println(engKey[i] + ":" + engKey[i].length());
		}
		
		koreans[0]="계속하다";
		koreans[1]="멈추다";
		koreans[2]="공공의";
		
		
		System.out.println("2. koreans 배열요소값이 참조하는 문자열의 길이");
		for(int i=0; i<koreans.length; i++) {
			if(koreans[i] != null) {//null이 아닐 시에만 출력하기
			System.out.println(koreans[i] + ":" + koreans[i].length());
			}
		}//참조하고 있는 객체가 없을 때 메소드/필드 참조하면 오류 발생
		
//		String temp=null;
//		System.out.println(temp.length()); //null은 참조해도 오류
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("static 뜻? >>>");
		koreans[3] = sc.nextLine();
		System.out.print("dynamic 뜻? >>>");
		koreans[4] = sc.nextLine();
		
		System.out.println("3. 모두 입력된 koreans 배열");
		for(int i=0; i<koreans.length; i++) {
			System.out.println(koreans[i]);
		}
		
		
		//사용자가 입력한 영어단어가 engKey배열 인덱스 몇번인가?
		System.out.println("찾을 단어는>>>");
		String find = sc.nextLine();
		
		int i;
		for(i=0; i<engKey.length; i++) {
			if(find.equals(engKey[i])) {
				break;			//i = 0 ~ engKey.length-1
			}
		}
		//break로 for를 중단하지 않고 for를 모두 실행했을 때는 같은 문자열이 없을 때
		
		System.out.println("찾은 단어 위치: " + i);
		if(i==engKey.length) {
			System.out.println("찾는 단어가 engKey에 없습니다.");
		}else {
			System.out.println("한글 뜻: " + koreans[i]);
		}
		
/*
		int index=-1;		//index변수 사용하지 않는 방법 생각해보기
		
		for(int i=0; i<engKey.length; i++) {
			if(find.equals(engKey[i])) {
				index = i;
				break;
			}
		}
		System.out.println("찾은 단어 위치: " + index);
		if(index==-1) {
			System.out.println("찾는 단어가 engKey에 없습니다.");
		}else {
			System.out.println("한글 뜻: " + koreans[index]);
		}
*/
	}
}
