package koreait.day08;

//작성자 이훈복
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;

	Member() { // 기본생성자
		System.out.println("name, email, age, level 필드는 기본값입니다.");
		System.out.println("name = " + this.name);	//this는 메소드를 실행하는 객체
		System.out.println("age = " + this.age);	//this는 메소드를 실행하는 객체
	}

	Member(String name, String email) {// 커스텀생성자
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
