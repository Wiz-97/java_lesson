package koreait.day08;

public class MyClass1Test {
	public static void main(String[] args) {
		//MyClass1 ��ü����
		MyClass1 my = new MyClass1();
			
		//MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ� ����?
		my.name = "Hello World";
		my.point = 1.23;
//		my.age = 23;	//����: private ������ �ʵ�
		my.setAge(23);	//private �ʵ尪 ����(����) �ϴ� �޼ҵ�: setter
//		System.out.println("age = " + my.age);	//����: private ������ �ʵ�
		System.out.println("age = " + my.getAge());	//private �ʵ尪 �о���� �޼ҵ� (getter)
		System.out.println("point = " + my.point);	//public ������ �ʵ�
		System.out.println("name = " + my.name);	//package �⺻ ������ �ʵ�
		
		
		
	}
	//Score Ŭ���� �ʵ�, �޼ҵ��� �����ڰ� ��� default�̱� ������ ���� �߻�
	//				�� new ��ü������ �Ǵ°�? ��: class �� public �������̹Ƿ� ���� ����
	Score score = new Score();
	//���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���
}
