package koreait.day04;

public class C19_MethodTest {
	public static void main(String[] args) {
		
		System.out.println("�޼ҵ带 ���� �����ؼ� ����غ��ϴ�.");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ�");
		System.out.println("��� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�.");
		System.out.println("1.");
		methodA();//�޼ҵ� ȣ��(����). �ʿ��� �� ȣ��
		
		System.out.println("2.");
		methodB(11,33);
		
		System.out.println("3.");
		methodC(1557,3.14);
		
		System.out.println("4.");
		methodD();		//��ȯ���� �ִ� �޼ҵ������� main �޼ҵ忡�� ��ȯ�� ����X
		System.out.println("return = " + methodD());
		
		int temp = methodD();		//��ȯ���� �޾Ƽ� ������ �����ϴ� ����
		System.out.println("return = " + temp);
		
		System.out.println("5.");
		methodE(3,5);
		System.out.println("return = " + methodE(3,5));
		
		double temp2 = methodE(3,5);
		System.out.println("return = " + temp2);
		
		System.out.println("6.");
		System.out.println((char)methodF('i',4));//methodF �����ϱ�
		
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);	//�޼ҵ� ���ڷ� ������ ����� �� ����
		
		
	}
	/*
	 * String Ŭ������ �޼ҵ带 ����.
	 * ���޼ҵ��� ���� ����
	 * 
	 * �޼ҵ��� �ֿ� ���: ��ȯ��, ����(argument) �Ǵ� �Ű�����(parameter), �޼ҵ� �̸�, public �Ǵ� static ���� ����
	 * ����ȯ��: �޼ҵ� ������ �Ϸ�Ǹ� ������� �����
	 * ������: �޼ҵ� ������ ���� �ʿ��� ������
	 * ���޼ҵ� �̸�: �ĺ���
	 * ��public: ����������, static: ���� ���
	 */
	
	
	//static�� main���� ������ �޼ҵ�� �����ϰ� static�̾�� ��
	public static void methodA() {
		System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
	}
	
	public static void methodB(int a, int b) {
		System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���޹��� �� a=" + a + ", b=" + b);
	}
	
	public static void methodC(int a, double b) {
		System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
		System.out.println("���޹��� �� a=" + a + ", b=" + b);
	}
	
	public static int methodD() {		//��ȯ���� �ִ� ����: ��ȯ���� int ������, �ݵ�� return�� �ʿ�
		System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
		return 999;
	}
	
	public static int methodE(int a, int b) {
		System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
		return a+b;
	}
	
	public static char methodF(char a, int b) {
		System.out.println("##������° �޼ҵ� ���� �����Դϴ�.##");
		return (char)(a+b);
	}
}
