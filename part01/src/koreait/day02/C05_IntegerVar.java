package koreait.day02;

public class C05_IntegerVar {
	public static void main(String[] args) {
		/*
		 * 1. main 메소드 안에서만 사용하는 지역변수 선언
		 * 2. 기본형(primitive)데이터 타입 정수 형식 byte, short, int
		 * ,long 키워드(역할이 정해진 단어)
		 * 
		 */
		byte n1;
		short n2;
		int n3;
		long n4;

		// 변수 선언하면서 초기값도 선언
		byte m1 = 100;
		short m2 = 100;
		int m3 = 100;
		long m4 = 100;

		int currentNo; // 변수명은 실제 저장되는값이 파악되는 단어로 만든다

//		System.out.println(n1);//오류 원인: n1에 값이 들어있지 않아서 출력 불가능
		System.out.println(m1);

		// 값의 대입(=)
		n1 = 50;
//		n1 = 999; => byte 최대값 127보다 큼
		n2 = 29999;
//		n2 = -40,000; => short 최소값 -32,768보다 작음
		n3 = 123456789;
//		n3 = 1,234,567,890,123; => int 최대값 2,147,483,647보다 큼
//		n4 = 1234567890123;// => long 리터럴 표시: L 또는 l 을 마지막에 써줌
		//integer 리터럴로 표시 가능한 범주를 넘어서는 경우에만 long 리터럴 표시 필수
		n4 = 1234567890123L;

		System.out.println("변수 n1 = "+ n1);
		System.out.println("변수 n2 = "+ n2);
		System.out.printf("변수 %s = %d \n","n3",n3);
	}// main 메소드 끝
	//1byte=8bit
	//대입문 또는 리터럴 표시할 때 값의 범위가 넘어가면 overflow
}
/*
 * 변수: 메모리에 저장된 값 중에서 변경할 수 있는 데이터
 * 변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간
 * 데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자) 부여
 * 메모리에 접근하기 위해서 변수명을 부여 변수 선언 -> 변수명과 데이터 형식 지정 -> 메모리에 할당
 */