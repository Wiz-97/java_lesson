package koreait.day07;

public class C35_GlobalVar {
	/* [������ ����� ��ġ�� ����]
	 * ��������(Local Variable): �޼ҵ�, for, if, while ���� {}������ ����� ����. ����� ����� ���� ��� �Ұ���
	 * ��������(Global Variable): Ŭ������ {}���� ����� ����
	 * 
	 * [���������� static ���η� ����]
	 * [Ŭ�����̸�.������]
	 * ��ü�� ���� ����ϴ� [this.������] => �ν��Ͻ� �ʵ�
	 * 
	 * ���������� Ŭ���� �Ǵ� ��ü�� Ư���� ��Ÿ�� �� �ʵ�(�Ǵ� ������Ƽ(property))��� �θ���.
	 */
	
	
	int count;		//��������
	String message;
	static int num;
	static final int TEST = 9999;		//static final = ���(������ ����, ���� �Ұ�). ������ �� �ʱ�ȭ ���� ������ ���� �߻�
	
	public static void main(String[] args) {	//static�� static ������ ����
		int num = 10;	//main �޼ҵ忡���� ��� ����
		System.out.println("num=" + num);
		methodB();
//		System.out.println("message=" + message);	//����: static�� �ƴ� ������ ��� �Ұ�
	}
	
	public void methodA() {
		int num = 99;		//methodA������ ��� ����
		System.out.println("num=" + num);
		System.out.println("message=" + message);	//���������� ����� message
	}
	
	public static void methodB() {
		int num = 77;	//methodB������ ����
		//���������� �������� �̸��� ���� ���, ���������� �����´�
		System.out.println("num=" + num);	//77
		System.out.println("num=" + C35_GlobalVar.num);		//Integer.BYTES�� ���� ����
		//���� ������ ����� num. static�� ���� Ŭ�����̸�.������ �̰� static�� �ƴ� ���� this.������
	}
	
	//******** ������ ���� �� ������ �޼ҵ�
	public void methodC(int count) {
		this.count=count;		//this�� new�� ������� ��ü. ==> methodC�� �����Ű�� ��ü
	}
}
