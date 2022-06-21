package koreait.day10;

public class ConstructorTest2 {
	public static void main(String[] args) {

	}
}

class Product2 {
	int price;

	// 부모클래스 디폴트 생성자 정의해서 자식클래스가 사용 가능하게 만듬
	// 디폴트 생성자는 동작 X
	public Product2() {
	}

	public Product2(int price) {
		this.price = price;
	}
}

class Food2 extends Product2 { 
	//부모클래스 Product2 디폴트 생성자 super()가 호출
	//Food2 디폴트 생성자는 보이지 않지만 자동으로 동작
}

class Electronics2 extends Product2 { // 위의 Food와 마찬가지

}