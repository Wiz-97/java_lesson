package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, max, min;
		// 3���� ������ �Է¹޾� ���� ū ���� ����ϱ�
		// �ۼ��� ���ƺ�
		System.out.print("ù��° ������ �Է��ϼ���>>> ");
		n1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ���>>> ");
		n2 = sc.nextInt();
		System.out.print("����° ������ �Է��ϼ���>>> ");
		n3 = sc.nextInt();

		if (n1 >= n2) {
			max = n1;
			min = n2;
			if (max < n3) {
				max = n3;
			}
		} else {
			max = n2;
			min = n1;
			if (max < n3) {
				max = n3;
			} else if (min > n3) {
				min = n3;
			}
		}

		System.out.printf("���� ū ������ %d�Դϴ�.\n", max);
		System.out.printf("���� ���� ������ %d�Դϴ�.", min);
		sc.close();
	}
}
