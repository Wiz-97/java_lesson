package koreait.day10;

public class ConstructorTest {
	public static void main(String[] args) {

	}
}

class Product {
	int price;

	//����Ʈ ������ ����X
	
	public Product(int price) {
		this.price = price;
	}
}

class Food extends Product { // Product() ����Ʈ ������ ���� -> Food ����Ʈ ������ ���� �� ������ ����ǹǷ� Product ����Ʈ ������ ����
							//����Ʈ ������ ���� �����ϱ� ���� Ŀ���� ������ ȣ��
	public Food(int price) {
		super(price);
		
	}
}

class Electronics extends Product { // ���� Food�� ��������

	public Electronics(int price) {
		super(price);				//super() ����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
		
	}
}