package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//Exception ó�� ����� ���� �޼ҵ忡�� ���ǵ� �� �ٸ� ���: 
public class C69_FileReadWriteTest {
	//main �޼ҵ尡 throws Exception �Ѵٸ�? ==>> jvm���� �ѱ�. ó�������� printStackTrace ����� ����
	public static void main(String[] args) {
		String filename = "C:\\iclass05\\�ڹ��׽�Ʈ0617.txt";
		try {
			fileWrite2(filename);
//			filename = "C:\\iclass05\\�ڹ��׽�Ʈ0617_2.txt";		//���� ���� �׽�Ʈ��
			fileRead(filename);
		} catch (FileNotFoundException e) {
			System.out.println("����� ���� ����: " + e.getMessage());
			System.out.println("������ �����ϴ��� Ȯ���ϼ���");
		}
	}

	// ���1: Exception�� try~catch�� ���� ó��
	public static void fileWrite(String filename) {
		File file = new File(filename);
		
		PrintWriter pw = null;
		try {
		pw = new PrintWriter(file);	//file�� ������ ��ġ�� ����� ���� ��ü
		pw.println("��� 90 89 92");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ��� �Ϸ�");
		}catch(FileNotFoundException e) {
			System.out.println("����� ���� �߻�: " + e.getMessage());
		}finally {
			pw.close();
		}
	}

//���2: throws Ű����� �ش� Exception ó���� ȣ���� ������ �ѱ��.(���ѱ��)
//		throws �ڿ� ,�� �����ؼ� �������� ���� ����
	public static void fileWrite2(String filename) throws FileNotFoundException {
		File file = new File(filename);
		
		PrintWriter pw = null;
		pw = new PrintWriter(file);	//file�� ������ ��ġ�� ����� ���� ��ü
		pw.println("��ȯ 90 89 92");
		pw.println("��� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ��� �Ϸ�.");
		pw.close();
	}

	
	
	public static void fileRead(String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
/*
 * AutoClosable Interface try-with-resources ����� ����Ϸ��� ����ϴ� ��ü�� AutoClosable
 * �������̽��� Implement�ؼ� ��� �����ؾ� �� ==>> AutoClosable�� ������ ��ü��� try���� ����� �� close()
 * ������ ȣ������
 */
