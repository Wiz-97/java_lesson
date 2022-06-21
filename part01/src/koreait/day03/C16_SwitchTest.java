package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {
	public static void main(String[] args) {
		// switch���� if ~ else if�� ����ϴ� ��ɹ�
		Scanner sc = new Scanner(System.in);
		int item_no;
		int price;

		System.out.println("��ǰ���:\n1. 2200��\n2. 1900��\n3. 3600��\n4. 2870��\n");
		System.out.print("������ ��ǰ�� �����ϼ���(��ȣ)>>>");
		item_no = sc.nextInt();

		switch (item_no) { // if������ ���ǽ� �ۼ����� ���� ���� ���� ����
		case 1: // �˻��� ��
			price = 2200;
			break; // �Ʒ��� ��ɹ����� �������� �ʰ� switch�� ����
		case 2:
			price = 1900;
			break;
		case 3:
			price = 3600;
			break;
		case 4:
			price = 2870;
			break;
		default: // case������ �ش���� �ʴ� ��
			System.out.println("�߸� �����߽��ϴ�.");
			price = 0;
			break;
		}
		System.out.println("�����ݾ��� " + price + "�� �Դϴ�.");

		// ���� switch���� if~elseif�� �ٲ㼭 �����غ���

		if (item_no == 1) {
			price = 2200;
		} else if (item_no == 2) {
			price = 1900;
		} else if (item_no == 3) {
			price = 3600;
		} else if (item_no == 4) {
			price = 2870;
		} else {
			price = 0;
			System.out.println("�߸� �����߽��ϴ�.");
		}
		System.out.printf("�����ݾ��� %d�� �Դϴ�.", price);
	}
}
