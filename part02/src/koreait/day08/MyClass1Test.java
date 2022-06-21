package koreait.day08;

public class MyClass1Test {
	public static void main(String[] args) {
		//MyClass1 객체생성
		MyClass1 my = new MyClass1();
			
		//MyClass1 클래스의 필드 중 사용할 수 있는 것은?
		my.name = "Hello World";
		my.point = 1.23;
//		my.age = 23;	//오류: private 한정자 필드
		my.setAge(23);	//private 필드값 대입(변경) 하는 메소드: setter
//		System.out.println("age = " + my.age);	//오류: private 한정자 필드
		System.out.println("age = " + my.getAge());	//private 필드값 읽어오는 메소드 (getter)
		System.out.println("point = " + my.point);	//public 한정자 필드
		System.out.println("name = " + my.name);	//package 기본 한정자 필드
		
		
		
	}
	//Score 클래스 필드, 메소드의 한정자가 모두 default이기 때문에 오류 발생
	//				ㄴ new 객체생성은 되는가? 답: class 는 public 한정자이므로 생성 가능
	Score score = new Score();
	//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용
}
