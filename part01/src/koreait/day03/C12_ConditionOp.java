package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
	//���ǽ��� ����� ���� ����� �����ϴ� ���ǿ�����: ���ǽ�? ��/����T : ��/����F
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int korean,math;//����, ��������
		
		System.out.print("���� ������ �Է��ϼ��� >> ");
		korean = sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� >> ");
		math = sc.nextInt();
		
		//����, ���� ��� 80�� �̻� -> ����л�
		System.out.println("����л�? " + (korean>=80&&math>=80));
		//����� ���� �� 90�� �̻� ���� -> Ư�� �л�
		System.out.println("Ư���л�? " + (korean>=90||math>=90));
		//���� ������ 20~80�� �ƴ� �л� -> Ư�� �л�(not���� ���)
		System.out.println("Ư���л�? " + ((korean>=20&&korean<=80)? "�½��ϴ�.":"�ƴմϴ�."));
		
		//if: ó���� ����� �����ϴ� ���ǹ�
		if(korean >= 80 && math >= 80) {
			//���ǽ��� ���϶� �����ϴ� ���
			System.out.println("�½��ϴ�.");
		}else {
//			���ǽ��� �����϶� �����ϴ� ���
			System.out.println("�ƴմϴ�.");
		}
		
		//{}�ȿ� ���� ����� 1���� ���� ���� ����
		if(korean>=90||math>=90)
			System.out.println("�½��ϴ�.");
		else
			System.out.println("�ƴմϴ�.");
		
		//���α׷��� ó�������� else{}�� �ش��ϴ� ������ ������ �ۼ�X
		if(!(korean>=20 && korean<=80))
			System.out.println("ǥ������ ���� ū �����Դϴ�.");
	}
}
