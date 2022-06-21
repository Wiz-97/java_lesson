package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class C42_Day07Exam {
	public static void main(String[] args) {
		// �ۼ��� ���ƺ�
		System.out.println("-------------------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-------------------------------------------------------");

		System.out.println("�����մϴ�.");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] random = new int[90];

		for (int i = 0; i < 90; i++) {
			random[i] = i + 10;// random �迭 10~99
		}

		int k;//����
		int[] operand1 = new int[10];
		int[] operand2 = new int[10];
		int correctNum=0;//���� ����
		int[] answer = new int[10];
		
		for (int i = 0; i < operand1.length; i++) {
			k = r.nextInt(90 - i);
			operand1[i] = random[k];
			
			for (int j = k; j < random.length - 1; j++) {
				random[j] = random[j + 1]; // ���� �� �����ϰ� �迭 ��ĭ�� ���
			}
		}

		for (int i = 0; i < operand2.length; i++) {
			k = r.nextInt(90 - i);
			operand2[i] = random[k];
			for (int j = k; j < random.length - 1; j++) {
				random[j] = random[j + 1]; // ���� �� �����ϰ� �迭 ��ĭ�� ���
			}
		}
		
		for(int i = 0; i<10; i++) {
			System.out.printf("����%d. %d + %d = �� �Է� >>>",i+1,operand1[i],operand2[i]);
			int ans = sc.nextInt();
			answer[i]=ans;
			if(ans == operand1[i]+operand2[i]) {
				correctNum++;
			}
		}
		System.out.println("-------------------------------------------------------");
		System.out.printf("ä���մϴ�. ���� ���� %d (%d��)\n",correctNum,correctNum*10);
		System.out.println(":::::�����Ʈ:::::");
		for(int i=0; i<answer.length; i++) {
			if(answer[i] != operand1[i] + operand2[i]) {
				System.out.printf("����%d. %d + %d = %d\n", i+1,operand1[i],operand2[i],operand1[i]+operand2[i]);
			}
		}
	}
}
