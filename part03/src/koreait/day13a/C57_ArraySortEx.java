package koreait.day13a;

public class C57_ArraySortEx {

	// �迭�� ����� �� �����ϱ�
	public static void main(String[] args) {
		int[] numbers = { 34, 77, 19, 56, 45, 9 };
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int k = i + 1; k < numbers.length; k++) {
				// �񱳿� ��ȯ
				if (numbers[i] > numbers[k]) {
					temp = numbers[i];
					numbers[i] = numbers[k];
					numbers[k] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
