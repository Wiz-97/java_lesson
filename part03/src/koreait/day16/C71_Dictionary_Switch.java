package koreait.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C71_Dictionary_Switch {
	public static void main(String[] args) {
		// �ۼ��� ���ƺ�
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> myWord = new ArrayList<>(); // myWord�� Word Ÿ���� ��ü�� Index�� ����ִ� �迭(ArrayList)
		try {
			System.out.print("���Ͽ��� �о� �ñ��? (y or n) >>>");
			if (ssc.nextLine().equals("y")) {
				read(myWord, "C:\\iclass05\\���ǿ��ѻ���.txt");
			} else {
				System.out.println("������ ���� ����ϴ�.");
			}
		} catch (FileNotFoundException e1) {
			System.out.println("���� �д� �߿� ���� �߻�" + e1.getMessage());
		} // ���Ͽ��� ���� ���� �о���� �� ������ myWord����Ʈ�� ����
			// TreepMap�� List�� �ٲ㼭 �����غ���
		boolean c = true;
		String choice, english, korean;
		int lvl;
		while (c) {
			System.out.println("--------------���� ���-------------");
			System.out.println("1.�ܾ����� 2. �ܾ�˻� 3. �ܾ��庸�� 4. �����ΰ˻� 5. ���α׷� ������");
			System.out.print("����>>");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("�����Ǵ� �ܾ �Է����ּ���");
				System.out.print("English -> ");
				english = sc.nextLine();
				System.out.print("Korean  -> ");
				korean = sc.nextLine();
				System.out.print("Level  -> ");
				lvl = Integer.parseInt(sc.nextLine());
				myWord.add(new Word(english, korean, lvl));
				break;
			case "2":
				System.out.println("ã������ ���ܾ �Է��ϼ���.");
				System.out.print("English -> ");
				english = sc.nextLine();
				for (Word w : myWord) {
					if (w.getEnglish().equals(english)) {
						System.out.println("�˻� ���: " + w);
					}
				}
				break;
			case "3":
//				System.out.println("�ܾ��� ��ü����: " + myWord);
				all(myWord);
				break;
			case "4":
				System.out.print("�˻��� ���� �Է�(1~3)>>>");
				int no = Integer.parseInt(sc.nextLine());
				level(myWord, no);
				break;
			case "5":
				c = false;
				break;
			default:
				System.out.println("��ȿ�� ��ȣ�� �Է��ϼ���.");
				break;
			}
		} // while end

		try {
			save(myWord, "C:\\iclass05\\���ǿ��ѻ���.txt");
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� �� ���� �߻�: " + e.getMessage());
		} // myWord����Ʈ ������ ���Ͽ� ����

		System.out.println(":::::�ܾ��� ����:::::");
		sc.close();
	}

	private static void read(List<Word> myWord, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while (sc.hasNext()) {
			String temp = sc.nextLine(); // ���Ͽ��� 1�� �о�� �� ����
			System.out.println(temp.substring(0, temp.indexOf("("))); // ��ü ���� �� �ʿ��� ���� ��������
			// ���� ����� ����� StringTokenizer�� Word ��ü ����� myWord ����Ʈ�� �߰��ϱ�
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			myWord.add(new Word(stk.nextToken(), // english �ʵ尪
					stk.nextToken(), // korean �ʵ尪
					Integer.parseInt(stk.nextToken()))); // level �ʵ尪
		}
		sc.close();
		System.out.println("���� �о���� �Ϸ�");
	}

	private static void save(List<Word> myWord, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for (Word w : myWord) {
			pw.println(w);
		}

		pw.close();
		System.out.println("���� ���� �Ϸ�");
	}

	private static void level(List<Word> myWord, int no) {
		for (Word w : myWord) {
			if (w.getLevel() == no) {
				System.out.println(w);
			}
		}
	}

	private static void all(List<Word> myWord) { // myWord�� ������ ���޹޾� ������ ��ü ����Ŵ
		myWord.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});

		System.out.println(String.format("%-20s %-20s %10s", "english", "korean", "level"));
		System.out.println("=====================================================");
		for (Word w : myWord) {
			System.out.println(String.format("%-20s %-20s %10s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}

	}
}
