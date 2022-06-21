package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumGame2Start {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 5;
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10]; // �ִ� 10�� ����� �����ϱ�
		int k = 0; // history �迭�� �ε��� ����

		System.out.println("���� ���߱� ���� �����մϴ�.");
		System.out.print("������ �����Ϸ��� �� �޸��� �̸��� ���ÿ�>>>");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;

		do {
			//�������
			GameValue temp = new GameValue(gamer);
			System.out.println("���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
			System.out.println(String.format("��, �޸��� ���纸����. (���� %d ~ %d)",rmin,rmax));
			int numComputer = r.nextInt(19) + 11;
			int numHuman;
			int i = 0;
			do {
				System.out.print("������ ���� �Է�(��ȸ: " + (max - i) + ") -> ");
				numHuman = sc.nextInt();
				if (numComputer > numHuman) {
					triallst[i] = numHuman; // i��° �Է��� ���ڰ� ����� �������� ������ �迭�� i��° ĭ�� ����
					i++; // trial Ƚ�� 1 �߰�(ī����)
					System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
				} else if (numComputer < numHuman) {
					triallst[i] = numHuman; // i��° �Է��� ���ڰ� ����� �������� ������ �迭�� i��° ĭ�� ����
					i++; // trial Ƚ�� 1 �߰�(ī����)
					System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
				}

				if (i == max) { // i�� �ʱⰪ 0���� �����ؼ� 10ȸ ���� �� i�� 10�� �Ǹ� �ݺ��� ����
					break;
				}

			} while (numComputer != numHuman); // ���ڰ� �������� ���� ���ȿ��� do ���� �ݺ�
			if (i == max) {
				System.out.println("�� �޸� �Է� ����: " + Arrays.toString(triallst));
				System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �� ���ϼ���.!!");
				temp.setCount(max);
			} else {
				System.out.println("�����Դϴ�! �������� �õ�Ƚ��: " + (i + 1));
				temp.setCount(i+1);
				temp.setSuccess(true);
			} // �������
				// ���� ���Ӱ���� history �迭�� ����
			history[k] = temp;
			k++; // ���� �ε�����, ī��Ʈ ����

			System.out.print("������ ����Ͻðڽ��ϱ�? ����Ϸ��� 0 �Է� >>>");
		} while (sc.nextInt()==0);
		System.out.println("::::::���ӽ��ھ�::::::");
		//for �ݺ����� history �迭�� ����� �� ���
		for(int j=0; j<k; j++) {
			history[j].print();		//history[j]�� Ÿ���� GameValue
			System.out.println("::::::::::The End::::::::::");
		}
		sc.close();
	}
}
