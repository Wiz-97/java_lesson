package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
	//조건식의 결과에 따라 명령을 선택하는 조건연산자: 조건식? 값/수식T : 값/수식F
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int korean,math;//국어, 수학점수
		
		System.out.print("국어 점수를 입력하세요 >> ");
		korean = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 >> ");
		math = sc.nextInt();
		
		//국어, 수학 모두 80점 이상 -> 모범학생
		System.out.println("모범학생? " + (korean>=80&&math>=80));
		//국어와 수학 중 90점 이상 존재 -> 특기 학생
		System.out.println("특기학생? " + (korean>=90||math>=90));
		//국어 점수가 20~80이 아닌 학생 -> 특이 학생(not연산 사용)
		System.out.println("특이학생? " + ((korean>=20&&korean<=80)? "맞습니다.":"아닙니다."));
		
		//if: 처리할 명령을 제어하는 조건문
		if(korean >= 80 && math >= 80) {
			//조건식이 참일때 실행하는 명령
			System.out.println("맞습니다.");
		}else {
//			조건식이 거짓일때 실행하는 명령
			System.out.println("아닙니다.");
		}
		
		//{}안에 들어가는 명령이 1개일 때는 생략 가능
		if(korean>=90||math>=90)
			System.out.println("맞습니다.");
		else
			System.out.println("아닙니다.");
		
		//프로그램의 처리조건이 else{}에 해당하는 내용이 없으면 작성X
		if(!(korean>=20 && korean<=80))
			System.out.println("표준편차 값이 큰 점수입니다.");
	}
}
