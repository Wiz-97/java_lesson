package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < 45; i++) { 	
			numbers.add(i+1);		//i��ġ�� i+1 ���� 			
		}
		System.out.println("numbers");
		System.out.println(numbers);	//toString�� ������
		
		ArrayList<Integer> lottery = new ArrayList<Integer>();
		
		int k; //������ ���� �� �ε���
		
		for(int cnt=0; cnt<6; cnt++) {
			k=r.nextInt(45-cnt);
			System.out.println("���õ� ���� = " + k + ", ���� ���� = " + numbers.get(k));
			lottery.add(numbers.get(k));
			numbers.remove(k);		//���� �� ����Ʈ���� ����
			System.out.println("���� ��");
			System.out.println(numbers);
		}
		
		
		System.out.println("���� ���� ����");
		System.out.println(lottery);
	}
	
	//�迭�� ����� ���� ��ġ ����(����/����) �޼ҵ尡 ����. �迭�� �����̴�.
	//-->> �̷� �κ��� ArrayList�� �ذ��ϰ� �����α׷����� �� ArrayList�� �ʼ�
}
