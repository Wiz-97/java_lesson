package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {
	public static void main(String[] args) {
		//sc�� ������. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� ����. -> ������ ����
		Scanner sc = new Scanner(System.in);//Ű���� �Է��� ���� ���� ����
		
		int data;
		
		System.out.print("���� ���� �Է��ϼ��� >>> ");
		
		data = sc.nextInt();
		System.out.println("�Էµ� ���� " + data + "�Դϴ�.");
		
		double point;
		System.out.print("�Ǽ� ���� �Է��ϼ��� >>> ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + "�Դϴ�.");
		
	}
}
/* 
 * ǥ�� ���: System.out(out�� System Ŭ������ ������ �ʵ�, �޼ҵ� println()�� ���� ������ �ʵ�)
 * 
 * ǥ�� �Է�: System.in		-> in�� System Ŭ������ ������ �ʵ�
 * 							-> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ��Ű�� ��� ���
 * 							-> �⺻ ��Ű���� Ŭ������ �ƴϹǷ� import �ʿ�
 */