package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
	public static void main(String[] args) {
		// �ۼ��� ���ƺ�
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;

		System.out.print("�̸��� ������ �Է��ϼ���>>>");
		String email = sc.nextLine();

		if (email.indexOf("@") != -1 && email.indexOf("@") == email.lastIndexOf("@")) {
			int check1 = email.indexOf("@") + 1;
			String domain = email.substring(check1, (email.length()));
			
			if (domain.equals("gmail.com")) {
				String account = email.substring(0, email.indexOf("@"));//�պκ� ����
				System.out.println("@ �պκ�: " + account);
				if (account.length() >= 6) {
					System.out.println("6���� �̻��� �����Դϴ�.");
					
					if((account.indexOf("$") == -1) && (account.indexOf("%") == -1)){
						System.out.println("���۰����� Ȯ�εǾ����ϴ�.");
					}else {
						System.out.println("�����̸��� $ Ȥ�� %�� ���ԵǸ� �ȵ˴ϴ�.");
						isValid = false;
					}
				} else {
					System.out.println("�����̸��� ���ڼ��� �����մϴ�.(6���� �̻� �ʿ�)");
					isValid = false;
				}
			} else {
				System.out.println("������ ������ Ʋ���ϴ�.");
				isValid = false;
			}
		} else {
			System.out.println("�̸��� ������ �ƴմϴ�.");
			isValid = false;
		}
		
		sc.close();


		/*
		 * ���� �̸��� ������ üũ�ϴ� ��� ����
		 * 1. @ ��ȣ�� 1�� ����
		 * 2. 1�� ���϶� @ �ڿ��� gmail.com
		 * 3. 2�� ���϶� @ �ձ����� ���ڿ� ����
		 * 4. 3�� �����̸��� 6���� �̻�
		 * 5. ���� �̸����� Ư����ȣ($,%)�� ���ԵǸ� �ȵ�
		 * 
		 */

	}
}
