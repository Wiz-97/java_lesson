package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_Dictionary_Switch {
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
			switch (choice) {
			case 1:
				System.out.println("�����Ǵ� �ܾ �Է����ּ���");
				System.out.print("English -> ");
				sc.nextLine();
				String english = sc.nextLine();
				System.out.print("Korean  -> ");
				String korean = sc.nextLine();
				dictionary.put(english, korean);
				break;
			case 2:
				System.out.println("ã������ ���ܾ �Է��ϼ���.");
				System.out.print("English -> ");
				sc.nextLine();
				String find = sc.nextLine();
				System.out.println("�˻� ���: " + dictionary.get(find));
				break;
			case 3:
				System.out.println("�ܾ��� ��ü����: " + dictionary);
				break;
			case 4:
				c=false;
				break;
			default:
				System.out.println("��ȿ�� ��ȣ�� �Է��ϼ���.");
				break;
			}
		}
	}

}
