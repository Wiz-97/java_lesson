package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		
		Dog dog = new Dog();
		dog.run();
		dog.print();	//상속 메소드
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println("::::::::::::::::::::::::");
		Animal temp = dog;		//자식 객체는 부모 클래스 타입으로 참조 가능
		temp.print();
//		temp.run();				//오류: 부모타입 변수로는 자식 메소드 실행 불가
		temp=crow;				//자식 객체는 부모 클래스 타입으로 참조 가능
		temp.print();
//		temp.fly();				//오류: 부모타입 변수로는 자식 메소드 실행 불가
		System.out.println("::::::::::::::::::::::::");
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run();				//오류: 부모타입 변수로는 자식 메소드 실행 불가

		Dog poodle = (Dog)puppy;	//Animal 타입을 Dog 타입으로 casting(자식 클래스만 가능)
		poodle.run();				//puppy 변수가 참조하는 객체가 Dog 타입일 때만 가능
		poodle.print();
		
		
		
	}

}
