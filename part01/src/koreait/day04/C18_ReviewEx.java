package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean,math,english,total;
		int subnum=0;
		String highscore;
		
		System.out.println("[[���� ����: ��հ� ���� ���ϱ�]]");
		System.out.println("������ �Է��ϼ���.");
		System.out.print("��������>>>");
		korean = sc.nextInt();
		subnum++;
		
		System.out.print("��������>>>");
		math = sc.nextInt();
		subnum++;
				
		System.out.print("��������>>>");
		english = sc.nextInt();
		subnum++;
		
		total = korean+math+english;
		
		System.out.println(">>ó���Ǿ����ϴ�.");
		System.out.printf("����: %d\n", total);
		System.out.printf("���: %d (%.2f), �����: %d\n",total/3, (double)total/3, subnum);
		
		if(korean>math && korean>english) {
			highscore="����";
		}else if(math>korean && math>english){
			highscore = "����";
		}else if(english>korean && english>math) {
			highscore = "����";
		}else {
			highscore = "����";
		}
		System.out.printf("�� �л��� Ư������� .%s. �Դϴ�.",highscore);
	}
}
