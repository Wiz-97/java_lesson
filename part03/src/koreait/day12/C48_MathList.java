package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43�� ���� ����Ʈ�� �����ϱ�
public class C48_MathList {
	public static void main(String[] args) {
		// �ۼ��� ���ƺ�
		Scanner sc = new Scanner(System.in);
		int size = 5; // ���� ����
		int max_size = MathProblem.max_size; // size �������� max_size �ʰ��ϴ��� �˻� �߰�

		ArrayList<MathProblem> problemList = new ArrayList<>();
		// ��� ���� �����ϴ� �迭

		// �迭�� Ÿ���� MathProblem ��ü������: n1, n2, op, isCorrect

		int ans;
		int cnt = 0;
		System.out.println("----------------------------------");
		System.out.println("������ ���� ���ڸ��� ���� ���� Ǯ��");
		System.out.println("----------------------------------");
		System.out.println("�����մϴ�.");
		for (int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb(); // n1, n2 ���� ��ü�� �ʵ�� ����

			System.out.print("����" + (i + 1) + ". " + temp.getN1() + " + " + temp.getN2() + "= �� �Է� >>>");
			ans = sc.nextInt();
			if (ans == temp.showAnswer()) { // ����� ��, ���� ���� count
				cnt++; // Ʋ�� ���� ī��Ʈ
				temp.setCorrect(true);
			}
//			problems[i] = temp;<<<��� ��ȯ?
			problemList.add(temp);
		}
		System.out.println("----------------------------------");
		System.out.println("ä�� �մϴ�. ���� ���� " + cnt + " (" + (cnt * 100 / size) + "��)");
		System.out.println(":::::Ʋ�� ���� ���� ����:::::");

		for (int i = 0; i < problemList.size(); i++) {
			if (!problemList.get(i).isCorrect()) { // �����̸� !�������� ������ �ٲ�
				System.out.println(
						"���� " + (i + 1) + ". " + problemList.get(i).problem() + problemList.get(i).showAnswer());
			}
		}

		sc.close();

	}
}
