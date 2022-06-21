package koreait.day02;

public class C03_IntegerData {
	public static void main(String[] args) {
		System.out.println("Byte 정수데이터---------------");
		System.out.println("메모리 크기: " + Byte.BYTES);//BYTES는 이미 정해져 있는 값
		System.out.println("Byte 정수의 최소값: " + Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값: " + Byte.MAX_VALUE);
		
		System.out.println("Short 정수데이터---------------");
		System.out.println("메모리 크기: " + Short.BYTES);//BYTES는 이미 정해져 있는 값
		System.out.println("Short 정수의 최소값: " + Short.MIN_VALUE);
		System.out.println("Short 정수의 최대값: " + Short.MAX_VALUE);
		
		System.out.println("Integer 정수데이터---------------");
		System.out.println("메모리 크기: " + Integer.BYTES);//BYTES는 이미 정해져 있는 값
		System.out.println("Integer 정수의 최소값: " + Integer.MIN_VALUE);
		System.out.println("Integer 정수의 최대값: " + Integer.MAX_VALUE);
		
		System.out.println("Long 정수데이터---------------");
		System.out.println("메모리 크기: " + Long.BYTES);//BYTES는 이미 정해져 있는 값
		System.out.println("Long 정수의 최소값: " + Long.MIN_VALUE);
		System.out.println("Long 정수의 최대값: " + Long.MAX_VALUE);
	}
}
//정수 데이터 기본형식 - byte, short, int, long 4가지
//					ㄴ각 메모리에 할당받는 크기(바이트 단위)와 그에 따른 값으 저장 범위 결정

//Byte, SHort, Integer, Long 클래스는 정수 데이터 형식을 다루는 속성과 메소드를 갖는 클래스.(Wrapper 래퍼 클래스)
//	ㄴ아래는 위 클래스들의 구성요소인 속성(필드)들 중 변하지 않는 값(상수). 대체로 대문자로 표기함
//		ㄴBYTES, MIN_VALUE, MAX_VALUE