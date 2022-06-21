package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {
	//하고 싶은 연습 해보기
	public static void main(String[] args) {
		
		//기본생성자로 객체 생성하기
		MyClass2 my2 = new MyClass2();
		//오류: 커스텀 생성자를 정의하면 기본으로  쓸 수 있는 기본생성자가 사용 불가능
		//==> 기본 생성자를 직접 입력해주면 오류 해결
		
		
		
		//커스텀 생성자로 객체 생성하기
		MyClass2 my22 = new MyClass2("김윤환");
		
		System.out.println("my2 name: " + my2.getName());
		System.out.println("my22 name: " + my22.getName());
		
		//my2 객체에 기본생성자를 허용하면 name 필드값 초기화를 못함.(예시적용)
		
		//기본생성자를 허용하지 않는 예시
//		Scanner sc = new Scanner();
	}
}
