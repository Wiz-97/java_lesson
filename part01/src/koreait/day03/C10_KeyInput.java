package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		//sc는 변수명. 기본형 변수가 아닌 클래스 타입의 변수. -> 참조형 변수
		Scanner sc = new Scanner(System.in);//키보드 입력을 위한 변수 선언
		
		int data;
		
		System.out.print("정수 값을 입력하세요 >>> ");
		
		data = sc.nextInt();
		System.out.println("입력된 값은 " + data + "입니다.");
		
		double point;
		System.out.print("실수 값을 입력하세요 >>> ");
		
		point = sc.nextDouble();
		System.out.println("입력된 값은 " + point + "입니다.");
		
	}
}
/* 
 * 표준 출력: System.out(out은 System 클래스의 정적인 필드, 메소드 println()을 실행 가능한 필드)
 * 
 * 표준 입력: System.in		-> in은 System 클래스의 정적인 필드
 * 							-> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시키는 기능 사용
 * 							-> 기본 패키지의 클래스가 아니므로 import 필요
 */