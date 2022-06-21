package koreait.day10;

import koreait.day09a.Animal;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog(); // upcasting(자동변환) <-> downcasting(강제변환)
		Animal ani2 = new Cat();

		Dog poodle = new Dog();
		Crow crow = new Crow();
		// 자식객체가 생성될 때 먼저 부모클래스 객체를 생성하면서 부모클래스 생성자 실행

		System.out.println("=====================================");
		animal(ani1);
//		animal(ani2);
//		animal(poodle);
//		animal(crow);
//		animal(new Frog());
	}

	// 다형성
	// 구현 예시1: 메소드 인자(또는 리턴) 타입이 Animal: Animal, Dog, Crow, Frog, Cat 객체 모두 가능
	public static void animal(Animal animal) {
		//구현 예시2: 메소드 재정의. Animal 객체 인스턴스 타입에 따라서 실행되는 act가 다름
		animal.act();
		
		
		
		animal.print();
		// 인자로 전달받은 animal 객체가 참조하는 것의 진짜 타입(인스턴스 타입) 검사: instanceof
		System.out.println("dog? " + (animal instanceof Dog)); // instanceof의 리턴값은 boolean(true, false)
		System.out.println("crow? " + (animal instanceof Crow));
		System.out.println("frog? " + (animal instanceof Frog));
		System.out.println("cat? " + (animal instanceof Cat));

		/*
		 * Animal 부모타입 참조는 자식클래스 필드와 메소드 접근 못함.
		 * animal.jump(); Frog
		 * animal.run(); Dog
		 * animal.fly(); Crow
		 * animal.groom(); Cat
		 */

		Cat cat;
		Dog dog;
		Crow crow;
		Frog frog;
		if (animal instanceof Cat) {
			cat = (Cat) animal; // 다운캐스팅: animal 진짜객체에 따라 오류 또는 오류 없음
			cat.groom();
		}
		if (animal instanceof Dog) {
			dog = (Dog) animal;
			dog.run();
		}
		if (animal instanceof Frog) {
			frog = (Frog) animal;
			frog.jump();
		}
		if (animal instanceof Crow) {
			crow = (Crow) animal;
			crow.fly();
		}
		
		animal.print();
		
	}	//animal 메소드 끝

}

class Dog extends Animal {

	protected int legs; // 디폴트 한정자 + 다른 패키지 자식 클래스

	public Dog() {
		System.out.println("새로운 동물은 강아지입니다.");
	}

	public void run() {
		setName("강아지");
		setColor("갈색");
		System.out.println("특징: 달리기");
	}
}

class Crow extends Animal {// 까마귀

	protected int wings;

	public Crow() {
		System.out.println("새로운 동물은 까마귀입니다.");
	}

	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징: 날기");
	}
}

class Frog extends Animal {// 개구리

	protected String mouth;

	public Frog() {
		System.out.println("새로운 동물은 개구리입니다.");
	}

	public void jump() {
		setName("개구리");
		setColor("초록색");
		System.out.println("특징: 높이뛰기");
	}
	
	//다형성 구현: 메소드 오버라이드					*비교: 오버로딩(overloading) - 각자 찾아보기
	//			ㄴ부모 클래스의 메소드를 재정의. 이때 인자와 리턴타입은 동일하게 한다
	@Override		//annotation 어노테이션: 코딩(또는 실행)할 때 참고가 되는 주석
	public void act() {
//		super.act();	//부모클래스의 act()실행
		System.out.println("Animal 행동: 수시로 높이뛰기");
	}
}

class Cat extends Animal {

	protected String eyes;

	public Cat() {
		System.out.println("새로운 동물은 고양이입니다.");
	}

	public void groom() {
		setName("고양이");
		setColor("고등어");
		System.out.println("특징: 그루밍");
	}
	
	@Override
	public void act() {
		System.out.println("Animal 행동: 자신의 털을 핥기");
	}
}