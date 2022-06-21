package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C68_FileReadTest {
	public static void main(String[] args) {
		String filename = "C:\\iclass05\\text.txt";
		File file = new File(filename);
		
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �б� �Ϸ�");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("����� ���� �߻�: " + e.getMessage());
		}
	}
}
/*
 * AutoClosable Interface
 * try-with-resources ����� ����Ϸ��� ����ϴ� ��ü�� AutoClosable �������̽���
 * Implement�ؼ� ��� �����ؾ� ��
 * ==>> AutoClosable�� ������ ��ü��� try���� ����� �� close() ������ ȣ������
 */