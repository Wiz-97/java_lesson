package koreait.day13a;

public class C54_CompareTo {
	public static void main(String[] args) {
		//��� ��ü(Object ���)���� compareTo �޼ҵ尡 ����: ���� ��
		
		String me = "kim";
		String you = "lee";
		String he = "park";
		
		//String�� ���ĺ�(������) ��
		System.out.println("kim�� lee ��: " + me.compareTo(you));	//-1(����): "kim">"lee"
		System.out.println("kim�� park ��: " + me.compareTo(he));	//-5(����): "kim">"park"
		
		int a = 12, b = 45;
		System.out.println("a-b: " + (a-b));	//12-45<0 => ����
		
		Integer aa=12;
		Integer bb=45;
		System.out.println("aa�� bb: " + aa.compareTo(bb));		//-1: aa<bb
		aa=90;
		System.out.println("90�� 45: " + aa.compareTo(bb));		//1: aa>bb
		aa=45;
		System.out.println("45�� 45: " + aa.compareTo(bb));		//0: aa==bb
		
		//compareTo�� ���� �񱳴� sort(����)�� ���
		//������ ��������, �������� 2���� ���
		
	}
}
