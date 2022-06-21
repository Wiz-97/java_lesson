package koreait.day12;

import java.util.Random;

public class MathProblem {
	//�ν��Ͻ� �ʵ�: static�� �ƴ� ����. ��ü�� ������ ������ �ٸ� ���� ���´�.
	private int n1;
	private int n2;
	private char op; // ��Ģ������
	private boolean isCorrect;
	public static final int max_size = 20;	//���� �ִ� ���� 20
	//isCorrect �ʵ� ��ſ� ans �ʵ� �߰��ؼ� ����ڰ� �Է��� �� ���嵵 ����

	public MathProblem(char op) {
		this.op = op; // ���ڷ� ���޹��� ���� ������
	}

	/*
	 * ����
	 * static �޼ҵ�� �ν��Ͻ� �ʵ尪�� ����(��ü�� ������ ����X)�ϰ� �����ϴ� �޼ҵ�
	 * �ν��Ͻ� �޼ҵ�� �ν��Ͻ� �ʵ尪�� ����Ǿ� �����ϴ� �޼ҵ�
	 */
	public void makeProb() { // ��Ģ���� �������� ������ ���� �����ϱ�->������ ����� �ݴϴ�.

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
		n1 = r.nextInt(max1 - min1 + 1) + min1;		//���� ���� min1~max1
		n2 = r.nextInt(max2 - min2 + 1) + min2;		//���� ���� min2~max2
	}

	public int showAnswer() { // n1,n2,op �ʵ尪�� �����ͼ� �������Ͽ� ��ȯ�մϴ�.
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

	//getter, setter �����(��������)
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