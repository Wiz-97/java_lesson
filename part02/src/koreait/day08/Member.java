package koreait.day08;

//�ۼ��� ���ƺ�
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;

	Member() { // �⺻������
		System.out.println("name, email, age, level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = " + this.name);	//this�� �޼ҵ带 �����ϴ� ��ü
		System.out.println("age = " + this.age);	//this�� �޼ҵ带 �����ϴ� ��ü
	}

	Member(String name, String email) {// Ŀ���һ�����
		this.name = name;
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
