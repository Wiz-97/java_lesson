package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputTest {

	public static void main(String[] args) {
		//�ۼ��� ���ƺ�
		Scanner sc = new Scanner(System.in);
		
		//�簢�� ������ ���� ���ϱ�
		int width;
		int height;
		
		System.out.print("���� �ʺ� �Է��ϼ���(cm����) >>> ");
		width = sc.nextInt();
		
		System.out.print("���� ���̸� �Է��ϼ���(cm����) >>> ");
		height = sc.nextInt();
		
		int squareArea = width*height;
		System.out.printf("���� = %dcm, ���� = %dcm �� ���簢���� ���� = " + squareArea + "�� \n",width,height);
		
		System.out.println("==============================================");
		
		//�� ������ ���̿� �ѷ� ���ϱ�
		final double PI = 3.14;
		double radius;
		
		System.out.print("���� ������ ũ�⸦ �Է��ϼ���(cm����) >>> ");
		radius = sc.nextDouble();
		
		double circleArea = PI*radius*radius;//radius ���� �Է� ���� �Ŀ� circleArea ��� ����
		
		System.out.printf("�������� %.3fcm�� ���� �ѷ� = " + (2*PI*radius) + "cm \n",radius);
		System.out.printf("�������� %.3fcm�� ���� ���� = " + circleArea + "�� \n",radius);
		
		sc.close();
		
		//final �׽�Ʈ
		//		�������� �տ� final Ű���带 ���̸� �� ���� �Ұ���
		final int test = 123;
		System.out.println("test = " + test);
//		test = 456; => final ������ �� ������ �Ұ��ϹǷ� ���� �߻�
	}

}
