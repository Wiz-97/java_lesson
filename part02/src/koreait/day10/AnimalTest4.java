package koreait.day10;

import koreait.day09a.Animal;

public class AnimalTest4 {
	
	//Animal클래스 isDog, isCrow 테스트: 메소드 인자 Object(다형성 구현)
	public static void main(String[] args) {
		
		
		Animal animal = new Dog();
		Dog poodle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		//메소드인자로 Object 타입객체를 받는 메소드
		System.out.println(Animal.isCrow(poodle));		//false
		System.out.println(Animal.isDog(poodle));		//true
		System.out.println(Animal.isDog("동물"));			//false
		System.out.println(Animal.isDog(1));			//false
		System.out.println(Animal.isCrow(animal));			//false
		System.out.println(Animal.isCrow(crow));			//false
		System.out.println(Animal.isCrow(animal2));			//false
		System.out.println(Animal.isCrow("까마귀"));			//false
		System.out.println(Animal.isCrow(1));			//false
		//Object는 어떤 인자든지 받을 수 있음
		
		
		
		
		
		
		
	}
}
