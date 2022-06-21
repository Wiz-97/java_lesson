package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {

	public static void main(String[] args) {
		// �ۼ��� ���ƺ�
		int[] num = new int[45];
		Random r = new Random();

		for (int i = 0; i < 45; i++) { 	// �ε��� ���� 0~44 ����
			num[i] = i + 1; 			// �� ���� 1~45 ����
		}

		int[] lottery = new int[6];			//���� ���� ������� �迭 ����
		int k;								//���� ���� ����
		for (int i = 0; i < 6; i++) {		// �̴� Ƚ�� 6��
			k = r.nextInt(45 - i);			// 0~44������ ���� �� �ϳ� ����, ������ bound���� �̱� ���࿡ ���� �ٿ�����
			System.out.println("���õ� ���� = " + k + ", ���� ���� = " + num[k]);
			lottery[i] = num[k];			// i��° ���� ���ڴ� ���� k��° num �迭

			for (int j = k; j < num.length - 1; j++) {
				num[j] = num[j + 1];		// ���� �� �����ϰ� �迭 ��ĭ�� ���
			}
//			System.out.println(Arrays.toString(num)); //�����ǰ� ��������� Ȯ��
		}
		System.out.print("���� ���� ����: ");
		System.out.println(Arrays.toString(lottery));

		Arrays.sort(lottery);				// �������� ����
		System.out.print("�������� ���: ");
		System.out.println(Arrays.toString(lottery));
	}
}
