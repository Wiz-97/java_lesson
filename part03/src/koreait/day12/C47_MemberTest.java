package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {
	public static void main(String[] args) {
		//Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>();	//����Ʈ�� ����Ǵ� ���� ��ü�� ������
		
		list.add(new Member("��ȯ", 34));				//���ο� ��ü �����ϰ� �������� ����Ʈ�� �߰�
		Member member = new Member("����", 33);
		list.add(member);
		list.add(new Member("���", 31));
		list.add(new Member("�м�", 25));
		System.out.println("���� list�� ��� ����: " + list.size());
		System.out.println("����Ʈ ���");
		System.out.println(list);
		
		//list.get(i)  -> Member ��ü�� ������
		System.out.println("2. list�� ��� �� age �ʵ尪�� 30 ������ �͸� ����غ���");// for��
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getAge()<=30) {
				System.out.println("i=" + i + ", " + list.get(i));
			}
		}
		
		
		System.out.println("3. '���'�� ��� �ε������� �����ϰ� �ִ� ��ü�ΰ�?");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("���")) {
				System.out.println("i=" + i + ", " + list.get(i));
			}
		}
		//����Ʈ ��Ұ� �������� �ʵ带 ���� ��ü�� �ʵ尪 ���ϴ� equals ����
		//							indexOf�� String, �⺻�� ���� Ŭ������ �߰� ��� ���� ���� ���
		
		System.out.println("Member ��ü�� indexOf ����: " + list.indexOf(new Member("����", 33)));
		//-1, ��ã��(����: ���������� ���� ���� ã�� ���ε� �̰��� �ʵ尪 ���ؼ� ã���� �ٲ��ִ� ��� �ʿ�
		System.out.println("Member ��ü�� indexOf ����: " + list.indexOf(member));	// 1
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getName().equals("���")&&list.get(i).getAge()==31) {
				System.out.println("i=" + i + ", " + list.get(i));
			}
		}
		
		
		
		
	}
}
