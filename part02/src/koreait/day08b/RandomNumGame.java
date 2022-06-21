package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 5;
		int[] triallst = new int[max];

		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println("��, �޸��� ���纸����. (101~299)");
		int numComputer = r.nextInt(199) + 101;
		int numHuman;
		int i = 0;
		do {
			System.out.print("������ ���� �Է�(��ȸ: " + (max - i) + ") -> ");
			numHuman = sc.nextInt();
			if (numComputer > numHuman) {
				triallst[i] = numHuman;		//i��° �Է��� ���ڰ� ����� �������� ������ �迭�� i��° ĭ�� ����
				i++;						//trial Ƚ�� 1 �߰�(ī����)
				System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
			} else if (numComputer < numHuman) {
				triallst[i] = numHuman;		//i��° �Է��� ���ڰ� ����� �������� ������ �迭�� i��° ĭ�� ����
				i++;						//trial Ƚ�� 1 �߰�(ī����)
				System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
			}

			if (i == max) {	//i�� �ʱⰪ 0���� �����ؼ� 10ȸ ���� �� i�� 10�� �Ǹ� �ݺ��� ����
				break;
			}

		} while (numComputer != numHuman);	//���ڰ� �������� ���� ���ȿ��� do ���� �ݺ�
		if(i==max) {
			System.out.println("�� �޸� �Է� ����: " + Arrays.toString(triallst));
			System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �� ���ϼ���.!!");
		}else {
			System.out.println("�����Դϴ�! �������� �õ�Ƚ��: " + (i+1));
			
		}
	}

}
