package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		//�ۼ��� ���ƺ�
		
		//�簢�� ������ ���� ���ϱ�
		int width = 23;
		int height = 19;
		double squareArea = width*height;
		System.out.printf("���� = %dcm, ���� = %dcm �� ���簢���� ���� = " + squareArea + "�� \n",width,height);
		
		System.out.println("==============================================");
		
		//�� ������ ���̿� �ѷ� ���ϱ�
		final double PI = 3.14;
		double radius = 23.230;
		double circleArea = PI*radius*radius;
		System.out.printf("�������� %.3fcm�� ���� �ѷ� = " + (2*PI*radius) + "cm \n",radius);
		System.out.printf("�������� %.3fcm�� ���� ���� = " + circleArea + "�� \n",radius);
		
		//final �׽�Ʈ
		//		�������� �տ� final Ű���带 ���̸� �� ���� �Ұ���
		final int test = 123;
		System.out.println("test = " + test);
//		test = 456; => final ������ �� ������ �Ұ��ϹǷ� ���� �߻�
	}

}
