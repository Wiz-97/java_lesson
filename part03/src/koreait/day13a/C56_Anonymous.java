package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {
	//�������̽� ����ü�� �͸� ���� Ŭ������ �����ϱ�
	public static void main(String[] args) {
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("I am anonymous");
				return 5978;
			}
			
			@Override
			public void methodA() {
				System.out.println("�͸� InterfaceA methodA");
				
			}
		};
		
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				
				return "�͸� ���� Ŭ����: " + name;
			}
		};
		
		ia.methodA();
		ia.methodD("�ȳ��ϼ���");
		InterfaceA.methodC();
		System.out.println(ib.name("����0����"));
		
		
		
		
		
	}
}
