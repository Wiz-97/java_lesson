package koreait.day10;

import koreait.day09a.Animal;

public class AnimalTest4 {
	
	//AnimalŬ���� isDog, isCrow �׽�Ʈ: �޼ҵ� ���� Object(������ ����)
	public static void main(String[] args) {
		
		
		Animal animal = new Dog();
		Dog poodle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		//�޼ҵ����ڷ� Object Ÿ�԰�ü�� �޴� �޼ҵ�
		System.out.println(Animal.isCrow(poodle));		//false
		System.out.println(Animal.isDog(poodle));		//true
		System.out.println(Animal.isDog("����"));			//false
		System.out.println(Animal.isDog(1));			//false
		System.out.println(Animal.isCrow(animal));			//false
		System.out.println(Animal.isCrow(crow));			//false
		System.out.println(Animal.isCrow(animal2));			//false
		System.out.println(Animal.isCrow("���"));			//false
		System.out.println(Animal.isCrow(1));			//false
		//Object�� � ���ڵ��� ���� �� ����
		
		
		
		
		
		
		
	}
}
