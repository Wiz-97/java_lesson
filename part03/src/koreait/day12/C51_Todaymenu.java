package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_Todaymenu {
	public static void main(String[] args) {
		System.out.println("������ ����޴� ��ǥ");
		String foods = "ġ��, ������, ��â, �Ұ���, �ܹ���, ��ȸ";

		// key: �޴��̸�, value: ��ǥ��

		// �ʱ�ȭ
		HashMap<String, Integer> map = new HashMap<>();
		map.put("ġ��", 0);
		map.put("������", 0);
		map.put("��â", 0);
		map.put("�Ұ���", 0);
		map.put("�ܹ���", 0);
		map.put("��ȸ", 0);

		Scanner sc = new Scanner(System.in);
		// �޴� ����(�ݺ�)
		while (true) {
			System.out.println(foods);
			System.out.print("���� �޴� ���� �̸� �Է�(����� end)>>>");
			String menu = sc.nextLine();
			if (menu.equals("end")) {
				break;
			}
			if(!map.containsKey(menu)) {
				System.out.println("���� �޴��Դϴ�. �޴��� �߰��մϴ�.");
				map.put(menu, 1);
				foods += "," + menu;
				continue;
			}
			
			//�Է¹��� menu�� value ���� �������� -> +1 -> ��� ����
			int temp = map.get(menu);
//			++temp;
			map.put(menu,  ++temp);		//���� => put
//			map.put(menu,  temp++);		//put => ����
			System.out.println(map);
		}
		
		System.out.println("��ǥ ����");
		System.out.println(map);
		System.out.println("�ִ� ��ǥ��: " + Collections.max(map.values()));
		System.out.println("�ִ� ��ǥ �޴�: " + Collections.max(map.keySet()));
		
	}
}