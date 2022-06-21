package koreait.day09a;

public class ClassAA extends ClassA {		//super(부모) 클래스는 ClassA
	
	
	//ClassAA의 인스턴스 메소드
	//name 필드는 상속받음(이 클래스에서 선언X)
	void test() {
		setName("YoonHwan");
		System.out.println("AA-name = " + name);
	}
	
}