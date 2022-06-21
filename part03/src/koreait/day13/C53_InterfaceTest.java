package koreait.day13;

public class C53_InterfaceTest {
	public static void main(String[] args) {
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();

		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();

		// ���� Ÿ�Կ� ���� �޼ҵ� ����(���� ����ü): z1,z2,z3�� � �޼ҵ� ���� ��������
		z1.methodA();
		z1.methodB(31);
		z1.name("�̰��");

		z2.methodA();
		z2.methodB(31);
//		z2.name("�̰��");	//����: InterfaceB�� �߻�޼ҵ�� ���� �Ұ�

//		z3.methodA();	//����: InterfaceA�� �߻�޼ҵ�� ���� �Ұ�
//		z3.methodB(32);	
		z3.name("�̰��");

		// ĳ����: ���� ����ü�� �������̽� Ÿ�� ĳ����
		InterfaceB ib = (InterfaceB) z2;
		ib.name("�̰��");
		InterfaceA ia = (InterfaceA) z3;
		ia.methodA();

		// ������ ���� ��
		iAmethod(x2);
//		iAmethod(y2);	//����: InterfaceA ����ü �ƴ�
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
//		iAmethod(z3);	//����: ���� ����Ÿ���� InterfaceB

		iBmethod(y1);
		iBmethod(y2);
		iBmethod(z1);
//		iBmethod(z2);	//����: ���� ����Ÿ���� InterfaceA
		iBmethod(z3);

	}

	// ������ ���� ����: �޼ҵ� ���� Ÿ���� InterfaceA
	// InterfaceA ����ü�� ��� ���ڷ� ���� ����
	public static void iAmethod(InterfaceA ia) {
		ia.methodA();
	}

	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("YH"));
	}
}