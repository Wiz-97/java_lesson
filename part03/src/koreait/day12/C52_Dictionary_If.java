package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_Dictionary_If {
	public static void main(String[] args) {
		//�ۼ��� ���ƺ�
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dictionary = new HashMap<String, String>();
		boolean c = true;
		while (c) {
			System.out.println("--------------���� ���-------------");
			System.out.println("1.�ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. ���α׷� ������");
			System.out.print("����>>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("�����Ǵ� �ܾ �Է����ּ���");
				System.out.print("English -> ");
				sc.nextLine();
				String english = sc.nextLine();
				System.out.print("Korean  -> ");
				String korean = sc.nextLine();
				dictionary.put(english, korean);
			} else if (choice == 2) {
				System.out.println("ã������ ���ܾ �Է��ϼ���.");
				System.out.print("English -> ");
				sc.nextLine();
				String find = sc.nextLine();
				System.out.println("�˻� ���: " + dictionary.get(find));
			} else if (choice == 3) {
				System.out.println("�ܾ��� ��ü����: " + dictionary);
			} else if (choice == 4) {
				c = false;
			} else {
				System.out.println("��ȿ�� ��ȣ�� �Է��ϼ���.");
			}
		}
	}

}
