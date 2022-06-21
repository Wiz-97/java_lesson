package koreait.day08;

public class MyClass1 {

	private int age; // 자바의 특성: 은닉성(기밀성)은 클래스의 필드값을 다른 클래스에 직접 접근 못하도록 함(캡슐화)
	String name;
	public double point;

	void setAge(int age) {
		if (age > 1 && age <= 150) {	//age 필드값의 검사
			this.age = age; // age필드는 현재 클래스에서만 접근.
		} else {
			System.out.println("잘못된 값입니다.");
		}
	}

	int getAge() {
		return age;
	}
	
	
}
/*
 * private int age; //private: 다른 클래스에서 사용 불가. 나만 사용 가능 String name;
 * //default(package): 다른 패키지에서 사용 못함. 이웃이면 같이 사용 public int score; //public:
 * 어디서나 사용 가능
 * 
 * private, default, protected(상속), public은 변수(필드), 메소드, 생성자, 클래스 등에 사용되는
 * 접근한정자(클래스는 접근한정자 default, public만 사용)
 */
