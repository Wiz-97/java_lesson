package koreait.day09a;

public class Crow extends Animal {//���
	
	protected int wings;
	
	public Crow() {
		System.out.println("���ο� ������ ����Դϴ�.");
	}
	
	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡: ����");
	}
}
