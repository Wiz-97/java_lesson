package koreait.ext;

public class BinaryOp {
	public static void main(String[] args) {
		
		//2������ ��Ʈ ����: &, |, ^, ~, >>, << �� ������ �׽�Ʈ
		int data = 0b0101110100100110;
		
		System.out.println("1. ��Ʈ ���� ���� '~'");
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		data = -2345;
		System.out.println("2. ������ ������ ����Ʈ ���� '>>'(���ʿ� �߰��Ǵ� ��Ʈ�� ����?)");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1), data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2), data>>2));
		//���� 32��Ʈ�� �� ���� ��Ʈ�� ��ȣ�� ǥ����. ������ ����Ʈ���꿡�� ���ʿ� �߰��Ǵ� ��Ʈ�� ��ȣ�� ����
		//����: ������ ����Ʈ �Ҷ� ��ȣ�� ������� ���ʿ� �߰��Ǵ� ��Ʈ�� 0���� �ؾߵ��� ���� >>>�������� ����
		
		
		System.out.println("3. ������ ����Ʈ ���� '>>>'");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>1), data>>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2), data>>>2));
		
		int n = 0xffffffff;			//32��Ʈ�� ��� 1
		data = 100;
		//����: ������ and�� �� and �� �϶��� ����� ��, or�� ���� or �����϶��� ����� ����
		//��Ʈ���� and�� 1&1 �϶��� �����1, ��Ʈ���� or�� 0 or 0�϶��� ����� 0
		System.out.println("4. &�� bit�� and ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("---------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n), data&n));
		
		System.out.println("\n5. |�� bit�� or ����");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data), data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n), n));
		System.out.println("---------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n), data|n));
		
		
		
	}
}
