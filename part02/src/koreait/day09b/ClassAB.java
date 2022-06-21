package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	// 과연 이 클래스가 필드, 메소드 상속 받았나 확인하기
	public void test() {
//		System.out.println("name = " + name);// 오류 발생 => name 필드 접근한정자 default => 다른 패키지에서 사용 불가
		title = "YH";						//상속받은 title 필드: 다른 패키지이지만 protected 접근한정자로 자식 클래스 허용
		System.out.println("AB-title = " + title);
		setName("1등기관사");
		System.out.println("name = " + getName());
	}

}
