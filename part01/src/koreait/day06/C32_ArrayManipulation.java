package koreait.day06;

public class C32_ArrayManipulation {
	public static void main(String[] args) {
		// �迭 ����� ����/����
		int[] test = { 11, 22, 33, 44, 55, 66, 77 };

		//�ε��� k�� ������ �� - ������ �ε��� ���� �������� �̵�
		int k = 2;
		for (int i = test.length - 2; i >= k; i--) {
//		for (int i = 2; i<test.length - 1; i++) {
			test[i + 1] = test[i];
		}
		test[k] = 23;
		
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + "\t");
		}

		int[] test2 = { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println();
		System.out.println("==============================================================");
		
		// �ε���2�� ������ �� - ���� �ε��� ���ҹ������� �̵�
		for (int i = 1; i < test2.length-1; i++) {
			test2[i] = test2[i+1];
		}

		for (int i = 0; i < test2.length-1; i++) {
			System.out.print(test2[i] + "\t");
		}

		//�ε��� k�� ������ �� - ���� �ε��� ���ҹ������� �̵�
		System.out.println();
		System.out.println("==============================================================");
		for(int i=k+1;i<test2.length;i++) {
			test2[i-1]=test2[i];
		}
		for(int i=0; i<test2.length;i++) {
			System.out.print(test2[i] + "\t");
		}//�ռ� �ε��� 2(22)�� �����ϰ� �ѹ� �� �ε��� 2(44)�� �����ؼ� �� 2�� ������ ���
		
	}
}
