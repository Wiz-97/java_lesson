package koreait.day10;

import koreait.day09a.Animal;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog(); // upcasting(�ڵ���ȯ) <-> downcasting(������ȯ)
		Animal ani2 = new Cat();

		Dog poodle = new Dog();
		Crow crow = new Crow();
		// �ڽİ�ü�� ������ �� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ����

		System.out.println("=====================================");
		animal(ani1);
//		animal(ani2);
//		animal(poodle);
//		animal(crow);
//		animal(new Frog());
	}

	// ������
	// ���� ����1: �޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal: Animal, Dog, Crow, Frog, Cat ��ü ��� ����
	public static void animal(Animal animal) {
		//���� ����2: �޼ҵ� ������. Animal ��ü �ν��Ͻ� Ÿ�Կ� ���� ����Ǵ� act�� �ٸ�
		animal.act();
		
		
		
		animal.print();
		// ���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ��(�ν��Ͻ� Ÿ��) �˻�: instanceof
		System.out.println("dog? " + (animal instanceof Dog)); // instanceof�� ���ϰ��� boolean(true, false)
		System.out.println("crow? " + (animal instanceof Crow));
		System.out.println("frog? " + (animal instanceof Frog));
		System.out.println("cat? " + (animal instanceof Cat));

		/*
		 * Animal �θ�Ÿ�� ������ �ڽ�Ŭ���� �ʵ�� �޼ҵ� ���� ����.
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
			cat = (Cat) animal; // �ٿ�ĳ����: animal ��¥��ü�� ���� ���� �Ǵ� ���� ����
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
		
	}	//animal �޼ҵ� ��

}

class Dog extends Animal {

	protected int legs; // ����Ʈ ������ + �ٸ� ��Ű�� �ڽ� Ŭ����

	public Dog() {
		System.out.println("���ο� ������ �������Դϴ�.");
	}

	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡: �޸���");
	}
}

class Crow extends Animal {// ���

	protected int wings;

	public Crow() {
		System.out.println("���ο� ������ ����Դϴ�.");
	}

	public void fly() {
		setName("���");
		setColor("������");
		System.out.println("Ư¡: ����");
	}
}

class Frog extends Animal {// ������

	protected String mouth;

	public Frog() {
		System.out.println("���ο� ������ �������Դϴ�.");
	}

	public void jump() {
		setName("������");
		setColor("�ʷϻ�");
		System.out.println("Ư¡: ���̶ٱ�");
	}
	
	//������ ����: �޼ҵ� �������̵�					*��: �����ε�(overloading) - ���� ã�ƺ���
	//			���θ� Ŭ������ �޼ҵ带 ������. �̶� ���ڿ� ����Ÿ���� �����ϰ� �Ѵ�
	@Override		//annotation ������̼�: �ڵ�(�Ǵ� ����)�� �� ���� �Ǵ� �ּ�
	public void act() {
//		super.act();	//�θ�Ŭ������ act()����
		System.out.println("Animal �ൿ: ���÷� ���̶ٱ�");
	}
}

class Cat extends Animal {

	protected String eyes;

	public Cat() {
		System.out.println("���ο� ������ ������Դϴ�.");
	}

	public void groom() {
		setName("�����");
		setColor("����");
		System.out.println("Ư¡: �׷��");
	}
	
	@Override
	public void act() {
		System.out.println("Animal �ൿ: �ڽ��� ���� �ӱ�");
	}
}