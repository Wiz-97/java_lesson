package koreait.day09;

public class C44_ForEachTest {
	public static void main(String[] args) {

		// �迭�� for������ ���������� ������ �� �ε��� ���� ���.
		int[] itest = { 1, 2, 3, 4, 5, 6 };
		String[] stest = { "break", "public", "each", "package", "while" };

		for (int i = 0; i < itest.length; i++) {
			System.out.println("i = " + i + ", itest[i] = " + itest[i]);
		}//���⼭ itest[i]�� int Ÿ��
		
		for(int i=0; i<stest.length; i++) {
			System.out.println("i = " + i + ", stest[i] = " + stest[i]);
		}//���⼭ stst[i]�� String Ÿ��
		
//		 �ڵ��� �� ȿ���� ���̱� ���� ���� for(for each) ���
		System.out.println("itest �迭��");
		for(int temp : itest) {	//�迭�� ����� ���� ������� ������ temp ������ ����
			System.out.println(temp);
		}
		
		System.out.println("\nstest �迭��");
		for(String temp : stest) {
			System.out.println(temp);
		}
		
	}
}