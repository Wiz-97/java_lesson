package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;

		System.out.println("[[��ȭ���� �ı�]]");
		System.out.print("������ �� �� �ֽðڽ��ϱ�?(1~5)>>>");
		score = sc.nextInt();

		System.out.println("���1");
		for (int i = 0; i < score; i++) {
			System.out.print("��");
		}

		System.out.println("\n\n���2_1");
		for (int i = 0; i < score; i++) {
			System.out.print("��");
		}
		for (int i = 0; i < 5 - score; i++) {
			System.out.print("��");
		}

		System.out.println("\n\n���2_2");
		for (int i = 0; i < 5; i++) {
			if (i < score) {
				System.out.print("��");
			} else {
				System.out.print("��");
			}
		}

		System.out.println("\n\n���2_3");
		int k;			//loop score ������ main �޼ҵ��� ��������
		for (k = 0; k < score; k++) {//score=?
			System.out.print("��");
		}
		
//		System.out.println("k=" + k);//k=?	���� for���� ���ᰡ �Ǵ� k ��
		for (; k < 5; k++) {//k�� score���� ����
			System.out.print("��");
		}
		
		sc.close();
	}
}
