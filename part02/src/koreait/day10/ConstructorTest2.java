package koreait.day10;

public class ConstructorTest2 {
	public static void main(String[] args) {

	}
}

class Product2 {
	int price;

	// �θ�Ŭ���� ����Ʈ ������ �����ؼ� �ڽ�Ŭ������ ��� �����ϰ� ����
	// ����Ʈ �����ڴ� ���� X
	public Product2() {
	}

	public Product2(int price) {
		this.price = price;
	}
}

class Food2 extends Product2 { 
	//�θ�Ŭ���� Product2 ����Ʈ ������ super()�� ȣ��
	//Food2 ����Ʈ �����ڴ� ������ ������ �ڵ����� ����
}

class Electronics2 extends Product2 { // ���� Food�� ��������

}