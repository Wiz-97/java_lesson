package koreait.day12;

import java.util.Random;

public class MathProblem {
	//인스턴스 필드: static이 아닌 형식. 객체가 생성될 때마다 다른 값을 갖는다.
	private int n1;
	private int n2;
	private char op; // 사칙연산자
	private boolean isCorrect;
	public static final int max_size = 20;	//문제 최대 갯수 20
	//isCorrect 필드 대신에 ans 필드 추가해서 사용자가 입력한 답 저장도 가능

	public MathProblem(char op) {
		this.op = op; // 인자로 전달받은 값이 연산자
	}

	/*
	 * 참고
	 * static 메소드는 인스턴스 필드값과 무관(객체와 연관된 동작X)하게 동작하는 메소드
	 * 인스턴스 메소드는 인스턴스 필드값과 상관되어 동작하는 메소드
	 */
	public void makeProb() { // 사칙연산 종류별로 적절한 난수 생성하기->문제를 만들어 줍니다.

		Random r = new Random();
		int max1 = 0, min1 = 0, max2 = 0, min2 = 0;
		switch (op) {
		case '+':
			max1 = 99;
			max2 = 99;
			min1 = 11;
			min2 = 11;
			break;
		case '-':
			max1 = 99;
			max2 = 49;
			min1 = 50;
			min2 = 11;
			break;
		case '*':
			max1 = 77;
			max2 = 29;
			min1 = 11;
			min2 = 11;
			break;
		case '/':
			max1 = 99;
			max2 = 29;
			min1 = 41;
			min2 = 11;
			break;

		}
		n1 = r.nextInt(max1 - min1 + 1) + min1;		//난수 범위 min1~max1
		n2 = r.nextInt(max2 - min2 + 1) + min2;		//난수 범위 min2~max2
	}

	public int showAnswer() { // n1,n2,op 필드값을 가져와서 정답계산하여 반환합니다.
		int result = 0;

		switch (op) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}

		return result;
	}

	public String problem() {
		return n1 + " " + op + " " + n2 + " = ";
	}

	//getter, setter 만들기(생략가능)
	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	

	
}
