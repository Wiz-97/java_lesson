package koreait.day09;

import java.util.Random;
import java.util.Scanner;

//C42���� MathProblem Ŭ������ �̿��ϴ� ������ �ٲٱ�. ������ ����
public class C43_RedPenEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size = 5; // ���� ����
		int max_size = MathProblem.max_size; // size �������� max_size �ʰ��ϴ��� �˻� �߰�

		MathProblem[] problems = new MathProblem[size];
		// ��� ���� �����ϴ� �迭

		// �迭�� Ÿ���� MathProblem ��ü������: n1, n2, op, isCorrect

		int n1, n2, ans;
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
//			System.out.print("���� "  + (i+1) + ". " + temp.problem() + "�� �Է�>>>");
			if (ans == temp.showAnswer()) { // ����� ��, ���� ���� count
				cnt++; // Ʋ�� ���� ī��Ʈ
				temp.setCorrect(true);
			}
			problems[i] = temp;
		}
		System.out.println("----------------------------------");
		System.out.println("ä�� �մϴ�. ���� ���� " + cnt + " (" + (cnt * 100 / size) + "��)");
		System.out.println(":::::Ʋ�� ���� ���� ����:::::");
//		for (int i = 0; i < problems.length; i++) {
//			if (!problems[i].isCorrect()) { // �����̸� !�������� ������ �ٲ�
//				System.out.println("���� " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer());
//			}
//		}
		//������ for���� for each������ �ٽ� �Ẹ��
		for(MathProblem temp : problems) {
			if (!temp.isCorrect()) { // �����̸� !�������� ���� ������ �ٲ�
				System.out.println(temp.problem() + temp.showAnswer());
			}
		}
		sc.close();
	}
	//�߰�: ����ڰ� �Է��� ans�� �����ؼ� ���� ��½� ���� �����ְ� �ʹٸ�?
	
}
