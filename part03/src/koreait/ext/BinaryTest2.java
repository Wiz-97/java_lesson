package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {
	public static void main(String[] args) {
		
		int n10 = 123;
		int n16 = 0xa41c;				//16진수 표기는 0x로 시작
		int n2 = 0b1010010000011100;	//2진수 표기는 0b로 시작
		
		
		System.out.println("1. 변수를 그대로 출력");
		System.out.println("10진수 리터럴: " + n10);
		System.out.println("16진수 리터럴: " + n16);			//정수값 출력은 format 지정 안하면 10진수 표기
		System.out.println("2진수 리터럴: " + n2);
		
		
		System.out.println("2. format 지정하여 16진수 출력");
		System.out.println(String.format("16진수 리터럴 0xa41c: %x", n16));				//16진수 형식: %x
		System.out.println(String.format("2진수 리터럴 0b1010010000011100: %x", n2));		//16진수 형식: %x
		System.out.println(String.format("10진수 리터럴 42012: %x", 42012));		//16진수 형식: %x
		//결론: 10진수 42012, n16과 n2 변수 값이 메모리에 저장될 때는 모두 동일한 0,1 표현값
		
		System.out.println("3. -1의 2진수, 16진수 표현 확인");
		n16=0xffffffff;	//int는 4qkdlxm
		System.out.println("16진수 0xffffffff: " + n16);
		System.out.printf("-1은 16진수 %x\n", -1);
		System.out.println("2진수: " + Integer.toBinaryString(-1));
		
		
		System.out.println("4. 입력한 2, 16진수 값을 10진수 값으로 바꿔드립니다.");
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 값 입력>>>");
		String t2 = sc.nextLine();
		System.out.print("16진수 값 입력>>>");
		String t16 = sc.nextLine();
		//원래는 Integer.parseInt(s) 형식이어쏙 s 문자열이 10진수 표현이라는 의미
		
		
		System.out.println(String.format("2진수 %s는 10진수 %d입니다.", t2, Integer.parseInt(t2, 2)));
		//t2는 2진수이다. -> 메소드 결과 정수값
		System.out.println(String.format("16진수 %s는 10진수 %d입니다.", t16, Integer.parseInt(t16, 16)));
		//t16은 16진수이다. -> 메소드 결과 정수값
		//최대 음수 입력값은 -7fffffff
		
		
		/* <<요약>>
		 * n은 2(Binary), 8(Octal), 16(hex) 가능
		 * n진법 문자열 -> 10진 정수값 변환 Integer.parseInt(문자열, n)
		 * 10진 정수값 -> n진법 문자열 Integer.toBinaryString, toHexString 메소드
		 * 
		 * format에서 %d는 10진수, %x는 16진수, %o는 8진수. 단, 2진수는 포맷 없음
		 * 
		 * 2진수의 비트연산: &, |, ^, ~, >>, << 등 간단히 테스트
		 * 
		 */
		
		
		
	}
}
