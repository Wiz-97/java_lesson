package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {
	public static void main(String[] args) {
		// if(���ǽ�){��ɹ�}else if(�� �ٸ� ���ǽ�){���} ...
		/*
		 * ���� ���θ� �����ø� �̺�Ʈ
		 * ���� ������ �ݾ��� 10���� �̻��̸� ������ ���űݾ��� 10%
		 * 7���� �̻� 9%
		 * 4���� �̻� 7%
		 * �� �̸� 3%
		 */
		Scanner sc = new Scanner(System.in);
		int totPrice;//�� ���űݾ�
		double rate;//������
		int payback;//�����ݾ�
		
		System.out.print("�� ���� �ݾ� >>>");
		totPrice = sc.nextInt();
		
		if(totPrice>=100000) {
			rate = 0.1;
		}else if(totPrice>=70000) {
			rate = 0.09;
		}else if(totPrice>=40000) {
			rate = 0.07;
		}else {			 
			rate = 0.03;
		}
		
		payback = (int)(totPrice*rate);
		
		System.out.printf("�������� %d%%�Դϴ�.\n",(int)(rate*100));
		System.out.printf("�����ݾ��� %d�� �Դϴ�.",payback);
		sc.close();
	}
}
