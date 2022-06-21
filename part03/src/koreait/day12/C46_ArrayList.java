package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		int[] datas = { 45, 23, 7, 21, 19, 11, 44 }; // �迭�� ������ �� �迭�� ũ�⸦ ����
		// �迭�� �⺻�� ������Ÿ��(int, double, long, ...). �Ǵ� ������ Ÿ��
		ArrayList<Integer> list = new ArrayList<>();
		// ArrayList�� ũ�Ⱑ ����
		// ������ Ÿ���� ������ Ÿ�Ը�. �⺻���� ����(Wrapper)Ŭ���� ���
		// <E>�� ���ʸ� Ÿ���̶�� ��(Generic = ��������)
		// ����Ʈ�� �����ϴ� �����͸� ���(Element)��� �Ѵ�
		// �ֿ� �޼ҵ�: add, get, size, remove

		String[] names = { "��ȯ", "���", "����", "����", "����" };
		ArrayList<String> name_list = new ArrayList<>();

		// ArrayList�� ������ �߰��� add() �޼ҵ� ���
		list.add(45);
		list.add(9);
		list.add(21);
		list.add(19);
		list.add(11);
		list.add(44);

		System.out.println("ù��° ArrayList<Integer> ���");
		System.out.println(list);
		System.out.println("����(�迭): " + Arrays.toString(datas) + ", �迭ũ��: " + datas.length);

		name_list.add("��ȯ");
		name_list.add("���");
		name_list.add("����");
		name_list.add("����");
		System.out.println("\n�ι�° ArrayList<String> ���");
		System.out.println(name_list); // null �ƴ�
		System.out.println("����Ʈ�� ũ��: " + name_list.size()); // �����Ͱ� ���� �� size = 0

		System.out.println("3. Ư�� ��ġ�� ������ �߰�");
		list.add(1, 23); // (�ε�����ġ, �߰��� ��) ��, �ε��� ��ġ�� ����Ʈ ũ�⺸�� ���� ��
		System.out.println("add(1,23) ���: " + list);
		name_list.add(2, "����");
		System.out.println("add(2, \"����\" ���: " + name_list);

		System.out.println("4. �迭ó�� index ������ ������ ��������");
		System.out.println("get(3): " + list.get(3));
		System.out.println("get(3): " + name_list.get(3));

		System.out.println("\n5. Ư�� ��ġ�� ������(���) ����");
		list.remove(4);
		System.out.println("remove(4) ���: " + list);
		name_list.remove(4);
		System.out.println("remove(4) ���: " + name_list);

		System.out.println("]n6. Ư�� �� ��ġ�� �˾Ƴ���('��ȯ'�� ��� �ε���?)");
		System.out.println("�迭: " + Arrays.binarySearch(names, "��ȯ"));
		System.out.println("����Ʈ: " + name_list.indexOf("��ȯ"));

		System.out.println("\n7. 6���� ���೻���� for������ �Ѵٸ�?");
		System.out.println("�迭");
		int i;
		for (i = 0; i < names.length; i++) {
			if (names[i].equals("��ȯ")) {
				break;
			}
		}
		System.out.println("'��ȯ'�� �ε���: " + i);

		System.out.println("����Ʈ");
		for (i = 0; i < name_list.size(); i++) {
			if (name_list.get(i).equals("��ȯ")) {
				break;
			}
		}
		System.out.println("'��ȯ'�� �ε���: " + i);
		
		//���� ã�� ��Ұ� ���� �� �ߺ��Ǿ� �����Ѵٸ�??
		//lastInexOf �޼ҵ�� ������ ��ġ�� ��� Ư�� ����
		
		
		System.out.println("\n8. contains �޼ҵ� - return Ÿ�� boolean");
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + name_list.contains("����"));
		System.out.println("'����'�� ����Ʈ�� �ִ°�? " + name_list.contains("����"));
		
		
		
		
		

	}
}

/*
 * �迭: ���� ���� �����͸� �����ϴ� ���
 * 
 * �÷���(Collections): �ڷᱸ��. ���� ���� �����͸� �����ϴ� ��, ������ Ư¡�� ���� ��������� ���̰� ���� ������ ����/����
 * ���� �˰����� �޼ҵ�� �����Ǿ� ���� ��ArrayList Ŭ���� ��HashMap Ŭ����
 * 
 */
