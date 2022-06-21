package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {
	public static void main(String[] args) {
		
		//�Ĵ��� �޴���(�޴��̸�, ����) �����͸� �����Ϸ��� ��
		String[] title = {"���ø�","����ø�","����"};
		int[] price = {12000,12000,10000};
		
		//key�� �޴��̸�, values�� �������� �ϴ� hashmap ����
		//key�� ���� �ߺ��Ǹ� �ȵ�
		HashMap<String,Integer> menus = new HashMap<>();
		
		//������ ����: put() �޼ҵ�
		menus.put("���ø�", 12000);
		menus.put("����ø�", 12000);
		menus.put("����", 10000);
		
		System.out.println("1. ����� ������ ���");
		System.out.println(menus);
		
		//������ ����(�б�): get() �޼ҵ�
		System.out.println("2. Ư���� key ���� value ���");
		System.out.println("'���ø��� ����?' " + menus.get("���ø�") + "��");
		System.out.println("'����ø��� ����?' " + menus.get("����ø�") + "��");
		System.out.println("'������ ����?' " + menus.get("����") + "��");
		
		//key �� �ߺ��Ǹ�?
		menus.put("����", 14000);		//������? �����(value�� ����)
		System.out.println(menus);
		
		
		//������ ����: remove() �޼ҵ�
		System.out.println("3. Ư�� ��� ����");
		menus.remove("����ø�");	//���ڰ� key
		System.out.println("���� ��� Ȯ��: " + menus);
//		menus.remove("����",10000);	//���� key, value: key�� value�� ��� ��ġ�ؾ� ����
		menus.remove("����",14000);
		System.out.println("���� ��� Ȯ��: " + menus);
		
		
		
		
		
		
	}
}
/*	ArrayList : ������(�ε����� ����) ���� �����͸� �����ϴ� �ڷᱸ���Դϴ�.�迭�� ������ �����Դϴ�.
	HashMap : �������� ������ �ƴմϴ�. �ε����� ������� �װ� Key ���� �̿��Ͽ� �����������Ͽ� ����/�б� �մϴ�.
				*�˻�*�� ���� �˰��� �����մϴ�. 
  				���ʸ� Ÿ���� K:Key , V:Value �ѽ��Դϴ�.
  				Key�� Value�� ��� Ÿ�� ����
  				(hashmap ������ key, value �ѽ����� ��Ұ� �ȴ�. value�� �˻��ϱ� ���� key ���
 	ArrayList �� ���������� int,long,double �⺻�� Ÿ�� ��ſ� ����(wrapper)Ŭ������ ǥ���մϴ�.
*/
