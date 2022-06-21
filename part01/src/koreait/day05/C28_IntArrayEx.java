package koreait.day05;

import java.util.Scanner;

public class C28_IntArrayEx {
	//�ۼ���: ���ƺ�
	/*
	 * 1. int �迭 ũ�� 5�� �����ϼ���. �̸��� nums
	 * 2. �迭 ����� ���� ����� �Է����� �����մϴ�.
	 * 3. �Էµ� ���� �հ�,����� ���մϴ�.
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 		�����ڴ� int �迭, ��ȯ�� ���� int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("���� �Է�>>>");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		System.out.printf("�迭 ����� ���� %d�Դϴ�.\n", sum);
		avg = (double)sum / nums.length;
		System.out.printf("�迭 ����� ��հ��� %.2f�Դϴ�.\n", avg);
		System.out.printf("�ִ밪�� %d�Դϴ�.",maxOfArray(nums));
		System.out.printf("�ּҰ��� %d�Դϴ�.",minOfArray(nums));
		
		sc.close();
	}

//	max,min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ
//	�迭��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ�
//	max�� �� ������ ������(or min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� ����
//	->�񱳰� ������ ���� max,min ����

	public static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int minOfArray(int [] array) {
		int min = array[0];
		for (int i=0; i<array.length;i++){
			if(min>array[i]) {
				min = array[i];
			}
		}
		return min;
	}
}
