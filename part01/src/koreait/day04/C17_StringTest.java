package koreait.day04;

public class C17_StringTest {
	public static void main(String[] args) {
		String name = "Lee";// ������ ����(Ŭ���� Ÿ��)
		String name2 = "Lee";
		String name3 = "Kim";
		String name4 = new String("Kim");// ���ο� String ��ü ����

		System.out.println("name == name2 ������ġ?" + (name == name2));
		System.out.println("name == name4 ������ġ?" + (name == name4));
		System.out.println("name2 == name4 ������ġ?" + (name2 == name4));
		
		name2="son";
		System.out.println("name == name2 ������ġ?" + (name == name2));
		
		System.out.println("name == ");
	}
}
/*
 * ���ڿ�: ��ȣ ""�� ����ϸ� ���ڿ�
 * �ڹٿ����� �⺻�� ������ �ƴϰ� String Ŭ���� Ÿ������ ��� 
 * 							�� �ʵ�, �޼ҵ� �̿��Ͽ� ���ڿ� ��� ���
 */