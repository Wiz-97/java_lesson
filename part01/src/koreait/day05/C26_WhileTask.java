package koreait.day05;

import java.util.Scanner;

/*
 * GUI: Graphic User Interface(����� ����� ������, �޴� ������� ó��)
 * CLI: Command Line Interface(����� ����� �ؽ�Ʈ�θ� ó���ϴ� ���)
 */




public class C26_WhileTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;// �ݺ��� ������ ����
		int sel;// ���� ���� ����
		int balance = 0;// �ܰ�(�ܾ�)

		while (run) { // �ʱⰪ�� ��
			int money; // while�� ��������. �Աݾװ� ��ݾ� ����
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ�Ȯ�� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("�޴� ����>>>");
			sel = sc.nextInt();

			switch (sel) {
			case 1:// ���� ó��
				System.out.print("���ݾ�>>>");
				money = sc.nextInt();
				balance += money;
				System.out.printf("%d�� �Ա��߽��ϴ�.", money);
				System.out.printf("������ ���� �ܾ��� %d���Դϴ�.\n", balance);
				break;
			case 2:// ��� ó��
				System.out.print("��ݾ�>>>");
				money = sc.nextInt();
				if (balance >= money) {
					balance -= money;
					System.out.printf("%d�� ����߽��ϴ�.", money);
					System.out.printf("������ ���� �ܾ��� %d���Դϴ�.\n", balance);
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				break;
			case 3:// �ܰ� ���
				System.out.printf("���� �ܰ�: %d��", balance);
				System.out.println();
				break;
			case 4:// �ݺ� ����
				System.out.println("���α׷��� �����մϴ�.");
				run=false;
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. 1~4������ �� �� �Է����ּ���.");
			}
		}
	}
}
