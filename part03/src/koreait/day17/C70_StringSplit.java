package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {
	public static void main(String[] args) {
		// String Ŭ������ split(�ɰ���) �޼ҵ�

		String temp = "��� 90 88 79";
		String result[] = temp.split(" ");
		System.out.println("index 0: " + result[0]);
		System.out.println("index 1: " + result[1]);
		System.out.println("index 2: " + result[2]);
		System.out.println("index 3: " + result[3]);

		// for������
		System.out.println("2. �Ϲ����� for ���");
		for (int i = 0; i < result.length; i++) {
			System.out.println(String.format("result[%d]: %s", i, result[i]));
		}

		// ���� for��(���� for��)
		System.out.println("3. ���� for ���");
		for (String t : result) {
			System.out.println("result ���: " + t);
		}
		
		String temp2 = "���,90,88,79";
		result = temp2.split(",");
		
		System.out.println("4. split ���б�ȣ ,�� �� ���� for ���");
		for (String t : result) {
			System.out.println("result ���: " + t);
		}
		
		temp2 = "���,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split ���б�ȣ ,");
		System.out.println("result length: " + result.length);
		for (String t : result) {
			System.out.println("result ���: " + t);
		}
		//result[1], result[3], result[5] 3���� �� ���ڿ�
		
		result = temp2.split(",,");
		System.out.println("6. split ���б�ȣ ,,");
		System.out.println("result length: " + result.length);
		for(String t : result) {
			System.out.println("result ���: " + t);
		}
		
		//Split�� ������ ���ڿ��� ���Խ�regex ���ڿ�(���Խ� ������ �����ϰ� �����)
		//			���Խ� ����: [] �ȿ� ǥ���ϴ� ���� ���� �������� �Ǵ�(or)�� �ش�
		
		
		temp2 = "���,90 88()79";
		result = temp2.split("[ ,()]");		//���Խ� ���ڿ�: ���� ��ȣ�� ���� �Ǵ� , �Ǵ� ( �Ǵ� )
		System.out.println("7. split ���ڰ� ���Խ�");
		System.out.println("result length: " + result.length);
		for(String t:result) {
			System.out.println("result ���: " + t);
		}
		
		temp2 = "���,90,88,79";
		result = temp2.split(",",2);
//		result = temp2.split(",",6);
		System.out.println("8. split �ι�° ���� limit Ȯ��");
		System.out.println("result length: " + result.length);
		for(String t : result) {
			System.out.println("result ���: " + t);
		}
		
		//�迭�� ������ �ڷᱸ��: List
		//�迭�� List�� ��ȯ�ϴ� ���
		System.out.println("9. result �迭�� List ��ü�� ����");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist size: " + rlist.size());
		for(String t : rlist) {
			System.out.println("rlist ���: " + t);
		}
		
		//���� rlist�� �迭�� ũ�⸸ŭ List�� �������� ����
//		rlist.add("test");		//����: ������ ����Ʈ -> ����Ұ�
//		rlist.remove("���");		//����: ������ ����Ʈ -> ����Ұ�
		
		//������ List�� �����(ũ�� ���� ����)
		System.out.println("10. ArrayList�� ���ڰ� �ִ� ������ �׽�Ʈ");
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println(rlist2);
		rlist.add("test");
		rlist.remove(2);
		rlist.add(2, "100");
		System.out.println(rlist2);
		
		
		//Arrays.asList�� �׽�Ʈ������ ����� ����Ʈ ���� ��
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("11. ArraysasList Ȱ��");
		System.out.println(ilist);
	}
}
