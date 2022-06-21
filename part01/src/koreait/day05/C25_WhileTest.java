package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {
	public static void main(String[] args) {
		// ��
		for (int i = 0; i < 5; i++) {
			System.out.printf("hello!(%d)\n", i);
		}

		// while�� ����
		// loop counter ���� ����&�ʱⰪ
		int j = 0;
		while (j < 5) { // ���ǽ�
			System.out.println("hello!(" + (j + 1) + ")");
			j++; // ������
		}

		// ����: for���� 1���� 100���� ���ϴ� �������� ���� ������� �� �� ����
		//		while���� ���� �������� ���� ������ ������� �� �� ����
		//		�ݺ����� �Բ�  ����ϴ� ��ɹ� - break, continue(continue ���� ��ɵ� �������� �ʰ� �ݺ����� ó������ �ǵ��ư�)
		
		
		int k = 0, sum = 0;
		Scanner sc = new Scanner(System.in);

		while (k != -1) {// k�� -1�� �ƴϸ� �ݺ�����
			System.out.print("�����Է�>>>");
			k = sc.nextInt();
			sum += k;// sum = sum + k
		}

		System.out.println("sum = " + sum);

		sum = 0;
		k = 0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�.[ver2](����:-1)");
		do {
			sum += k;
			System.out.print("�����Է�>>>");
			k = sc.nextInt();
		} while (k != -1);// ������ �ڿ��� �˻��ϴ� ��ɹ�
		System.out.println("sum = " + sum);

		
		sum = 0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�.[ver2.1](����:-1)");
		while(true) {
			System.out.print("���� �Է�>>>");
			k=sc.nextInt();
			
			if(k==-1) {
				break;
			}
			sum += k;
		}
		System.out.println("sum = " + sum);
		
		
		sum = 0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� ���� �Դϴ�.[ver2.2](����:-1)");
		boolean isState = true;
		while (isState) {
			System.out.print("�����Է�>>>");
			k = sc.nextInt();
			if (k == -1) {//boolean ���� Ȱ��. �������ǰ��϶� boolean ������ false�� �Ѵ�
				isState = false;
				System.out.println("sum = " + sum);
			} else {
				sum += k;
			}
		}
		
		
		//continue ����: �Էµ� ���� 10�� ����̸� sum�� ������ �ʰ� �ٽ� �Է¹ޱ�
		sum=0;
		System.out.println("\n\ncontinue���� �����Դϴ�.(����:-1)");
		while(true) {
			System.out.print("���� �Է�>>>");
			k = sc.nextInt();
			if(k==-1) {break;}
			if(k%10==0) {continue;}
			sum += k;
		}
		System.out.println("sum = " + sum);
		
		sc.close();
		
	}
}
