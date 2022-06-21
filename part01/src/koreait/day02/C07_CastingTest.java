package koreait.day02;

public class C07_CastingTest {
	
	public static void main(String[] args) {
		
		//���Թ�: ������ ��/����/������ ���� ������ ����. ���Ŀ� ���Ǵ� �����ڴ� �Ʒ��� ����.
		//���������: +, -, *, /(������), %(������ ���), ...
		//���迬����: ==(����, ����), !=(����, ���� �ʴ�), >, <, >=, <=, ...
		//��������: &&(AND), ||(OR), !(NOT)
		
		//����: ++, --, +=, -=, /=, ... �� �� ���� ��࿬���ڴ� �Ŀ� ����
		//���������� ������ int
		
		int a = 123, b = 13;//���� Ÿ���� ������ �� �ٿ��� ���� ����
		double c = 10.34;
		
		//���꿡 ���Ǵ� �ǿ����ڰ� ��� �����̸� ����� ����
		//���꿡 ���Ǵ� �ǿ����ڿ� ������ �Ǽ��� ���������� ����� �Ǽ�
		//��, �������� ������ ������ �� �ݵ�� �������� ������ ������ Ȯ���ؾ���
		
		int asum;
		double bsum;
		
		asum = a + b;
		bsum = a + c;
		
		System.out.println("a + b = " + asum);
		System.out.println("a + c = " + bsum);
		
		//����ȯ(casting): ���� + �Ǽ� ����� �� ���� ������ �����ؾ� �Ѵٸ� �Ǽ��� ������ ��ȯ�ؼ� ���
		
		asum = a + (int)c;//c������ �Ǽ����� ������ ��ȯ
		
		System.out.println(asum);
		
		System.out.println("a/b = " + (a/b));//�������� ������ ��� ����
		System.out.println("a%b = " + (a%b));//�������� �������� ������
		
		System.out.printf("%d %% %d = %d\n",a,b,a%b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		
		System.out.println("����/���� = �Ǽ� ���� ������ ����ϱ�");
		System.out.printf("%d / %d = %.2f\n",a,b,(double)a/b);//�Ǽ� ���Ĺ��� %f, �⺻ �Ҽ��� ���� 6�ڸ�
		
		double test = 12.34569489811461;
		System.out.println("test = " + test);
		System.out.printf("test = %.8f\n",test);
		System.out.printf("test = %f\n",test);//�⺻�� �Ҽ� 6��°�������� Ȯ�� ����
		
	}
	
}
