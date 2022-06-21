package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {
	/*
	 * 데이터의 기본 형식:boolean은 true 혹은 false의 값만 가짐
	 * 
	 * 관계연산자(==, !=, >, <, ... 등)에 의한 결과들이 boolean 형식으로 나타남
	 * 참고: if, for에서 필요한 조건식에 관계연산 사용
	 */
	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10>5 결과: " + result);
		
		System.out.println("9 != 9 결과: " + (9!=9));
		System.out.println("9 == 9 결과: " + (9==9));
		
		System.out.println("논리연산 결과 확인하기: and");
		System.out.println("true and true = " + (true&&true));
		System.out.println("true and false = " + (true&&false));
		//아래 2개 논리식은 첫번째 값이 false이므로 두번째 값 무시
		System.out.println("false and true = " + (false&&true));
		System.out.println("false and false = " + (false&&false));
		
		System.out.println("논리연산 결과 확인하기: or");
		//아래 2개 논리식은 첫번째값이 true이므로 두번째 값은 무시함
		System.out.println("true and true = " + (true||true));
		System.out.println("true and false = " + (true||false));
		System.out.println("false and true = " + (false||true));
		System.out.println("false and false = " + (false||false));
		
		System.out.println("논리연산 결과 확인하기: not");
		System.out.println("not true = " + !true);
		System.out.println("not false = " + !false);
		
		int korean,math;//국어, 수학점수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 >> ");
		korean = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 >> ");
		math = sc.nextInt();
		
		//국어, 수학 모두 80점 이상 -> 모범학생
		System.out.println("모범학생? " + (korean>=80&&math>=80));
		//국어와 수학 중 90점 이상 존재 -> 특기 학생
		System.out.println("특기학생? " + (korean>=90||math>=90));
		//국어 점수가 20~80이 아닌 학생 -> 특이 학생(not연산 사용)
		System.out.println("특이학생? " + !(korean>=20&&korean<=80));
		sc.close();
		
	}
}
