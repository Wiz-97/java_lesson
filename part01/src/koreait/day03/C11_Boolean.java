package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {
	/*
	 * �������� �⺻ ����:boolean�� true Ȥ�� false�� ���� ����
	 * 
	 * ���迬����(==, !=, >, <, ... ��)�� ���� ������� boolean �������� ��Ÿ��
	 * ����: if, for���� �ʿ��� ���ǽĿ� ���迬�� ���
	 */
	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10>5 ���: " + result);
		
		System.out.println("9 != 9 ���: " + (9!=9));
		System.out.println("9 == 9 ���: " + (9==9));
		
		System.out.println("������ ��� Ȯ���ϱ�: and");
		System.out.println("true and true = " + (true&&true));
		System.out.println("true and false = " + (true&&false));
		//�Ʒ� 2�� ������ ù��° ���� false�̹Ƿ� �ι�° �� ����
		System.out.println("false and true = " + (false&&true));
		System.out.println("false and false = " + (false&&false));
		
		System.out.println("������ ��� Ȯ���ϱ�: or");
		//�Ʒ� 2�� ������ ù��°���� true�̹Ƿ� �ι�° ���� ������
		System.out.println("true and true = " + (true||true));
		System.out.println("true and false = " + (true||false));
		System.out.println("false and true = " + (false||true));
		System.out.println("false and false = " + (false||false));
		
		System.out.println("������ ��� Ȯ���ϱ�: not");
		System.out.println("not true = " + !true);
		System.out.println("not false = " + !false);
		
		int korean,math;//����, ��������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� >> ");
		korean = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� >> ");
		math = sc.nextInt();
		
		//����, ���� ��� 80�� �̻� -> ����л�
		System.out.println("����л�? " + (korean>=80&&math>=80));
		//����� ���� �� 90�� �̻� ���� -> Ư�� �л�
		System.out.println("Ư���л�? " + (korean>=90||math>=90));
		//���� ������ 20~80�� �ƴ� �л� -> Ư�� �л�(not���� ���)
		System.out.println("Ư���л�? " + !(korean>=20&&korean<=80));
		sc.close();
		
	}
}
