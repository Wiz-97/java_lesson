package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		
		Dog dog = new Dog();
		dog.run();
		dog.print();	//��� �޼ҵ�
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println("::::::::::::::::::::::::");
		Animal temp = dog;		//�ڽ� ��ü�� �θ� Ŭ���� Ÿ������ ���� ����
		temp.print();
//		temp.run();				//����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� �Ұ�
		temp=crow;				//�ڽ� ��ü�� �θ� Ŭ���� Ÿ������ ���� ����
		temp.print();
//		temp.fly();				//����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� �Ұ�
		System.out.println("::::::::::::::::::::::::");
		Animal puppy = new Dog();
		puppy.print();
//		puppy.run();				//����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� �Ұ�

		Dog poodle = (Dog)puppy;	//Animal Ÿ���� Dog Ÿ������ casting(�ڽ� Ŭ������ ����)
		poodle.run();				//puppy ������ �����ϴ� ��ü�� Dog Ÿ���� ���� ����
		poodle.print();
		
		
		
	}

}
