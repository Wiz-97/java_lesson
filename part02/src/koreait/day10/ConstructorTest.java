package koreait.day10;

public class ConstructorTest {
	public static void main(String[] args) {

	}
}

class Product {
	int price;

	//디폴트 생성자 동작X
	
	public Product(int price) {
		this.price = price;
	}
}

class Food extends Product { // Product() 디폴트 생성자 실행 -> Food 디폴트 생성자 실행 의 순서로 진행되므로 Product 디폴트 없으면 오류
							//디폴트 생성자 없이 실행하기 위해 커스텀 생성자 호출
	public Food(int price) {
		super(price);
		
	}
}

class Electronics extends Product { // 위의 Food와 마찬가지

	public Electronics(int price) {
		super(price);				//super() 디폴트 생성자 대신에 커스텀 생성자 호출
		
	}
}