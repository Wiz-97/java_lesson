package koreait.day08;

public class MyClass2 {
	private int age;
	private String name;
	//�⺻�����ڸ� ���� �����غ���
	MyClass2(){}
	
	//Ŀ���� ������ ���� ����: ������ �޼ҵ� �̸��� �ݵ�� 1)Ŭ���� �̸��� �����ϰ� 2) 
	//										3) ���� �����ڴ� 4���� ��� ����
	MyClass2(String name){
		this.name = name;		//setter �޼ҵ�ó�� ��������(�ʵ�)���� �ʱ�ȭ
	}
	
	//����: Ŀ���һ����ڸ� �����ϰ� �⺻������ ������� �ʴ� ��찡 ����
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {	//setter�� �����ڷ� ����ϰ� getter�� �ִ� ����
		return name;			//-> �����ڿ��� �ʱ�ȭ�� ���� ������ �� ����.
	}
	
}
//������ �޼ҵ� �����մϴ�.(���ϰ��� ���� , ���ڴ� �������� �ִ� �޼ҵ� )- constructor
//-> ������ �޼ҵ� �������� ��ü�� ��������ϴ�. 	
//-> �⺻������ : ���ڰ� ���� ������ ������
//-> Ŀ���һ����� : �ʵ尪 �ʱ�ȭ�� ���ؼ� ���ڰ� �ִ� ������ ������
