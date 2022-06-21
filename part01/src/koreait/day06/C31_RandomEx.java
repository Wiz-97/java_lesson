package koreait.day06;

import java.util.Random;

public class C31_RandomEx {
public static void main(String[] args) {
	/*
	 * �л� ����(����) ���� ������ ����ϴ�.
	 * �л� �ο��� 100�� - ������ ���������� �׽�Ʈ(0<=����<=100)�մϴ�.
	 * 
	 * 90~100: O��(���� %)			ī��Ʈ ���� 5�� �ʿ�(cntA,B,C,D,E)
	 * 80~89									��counts[5]:counts[0],counts[1],...
	 * 70~79
	 * 60~69
	 * 60 �̸�
	 */
	Random r = new Random();
	int[] korean = new int[100];
	int[] counts = new int[5];
	
	for(int i = 0; i < korean.length; i++) {
		korean[i] = r.nextInt(101);
	}//���� ���� ����
	
	//���� ���� count�ϱ�
	for(int i=0;i<korean.length; i++) {
		if(korean[i]>=90) {
			counts[0]++;
		}else if(korean[i]>=80) {
			counts[1]++;
		}else if(korean[i]>=70) {
			counts[2]++;
		}else if(korean[i]>=60) {
			counts[3]++;
		}else{
			counts[4]++;
		}
	}
	
	//���� ���� ��� ����ϱ� 
	System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
//	System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60�̸�");
	System.out.println("------------------------------------------------------------------------");
	for(int i = 0; i < counts.length; i++) {
		System.out.printf("%2d��\t", counts[i]);
	}
	
	System.out.println();
	for(int i = 0; i < counts.length; i++) {
		System.out.printf("%.1f%%\t", (double)counts[i]/korean.length*100);
	}
}


//�迭���� ����� ���(������ ����/����, ũ�⵵ �������� ����)�� ���� �ڹ� ArrayList
//�迭������ ���� ������ ����/������ ���� -> �޼ҵ� ����
}
