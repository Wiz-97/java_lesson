package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	// ���� �� Ŭ������ �ʵ�, �޼ҵ� ��� �޾ҳ� Ȯ���ϱ�
	public void test() {
//		System.out.println("name = " + name);// ���� �߻� => name �ʵ� ���������� default => �ٸ� ��Ű������ ��� �Ұ�
		title = "YH";						//��ӹ��� title �ʵ�: �ٸ� ��Ű�������� protected ���������ڷ� �ڽ� Ŭ���� ���
		System.out.println("AB-title = " + title);
		setName("1������");
		System.out.println("name = " + getName());
	}

}
