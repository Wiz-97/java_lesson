package koreait.day09a;

/*
 * Ŭ������ ���
 * ->Ŭ���� ���� �θ�(����Ŭ����, super)-�ڽ�(���� Ŭ����) ����
 * ->�θ��� Ŭ���� ������Ҹ� �ڽ��� ��� ����. ��ӵǴ� ��Ҵ� �ʵ�, �޼ҵ�
 * ->extends Ű���� ����� ��ӹ��� �θ�Ŭ���� ����
 * ->private ���������ڴ� ��� �Ұ�
 * ->protected�� �ٸ� ��Ű���� �ڽ�Ŭ������ ��� ����
 * 
 */

public class ClassA {
	int ab;
	String name;
	protected String title;
	//protected�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���
	
	void print() {
		System.out.println("A-ab = " + ab);
		System.out.println("A-name = " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
